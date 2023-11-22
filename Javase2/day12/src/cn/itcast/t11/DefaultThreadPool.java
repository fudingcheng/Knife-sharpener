package cn.itcast.t11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 默认的线程池
 */
public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {

    // 线程池中最大的线程数量
    private static final int MAX_WORKERS_NUM = 10;

    //线程池中最小的线程数量
    private static final int MIN_WORKERS_NUM = 1;

    //线程池中默认的线程数量
    private static final int DEFAULT_WORKERS_NUM = 5;

    //工作任务队列,添加和删除操作较多,用列表更加的合适
    private LinkedList<Job> jobs = new LinkedList<Job>();

    //工作者列表
    private List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());

    // 工作者线程的数量
    private int workNum = DEFAULT_WORKERS_NUM;

    // 线程编号生成
    private AtomicInteger threadNum = new AtomicInteger();

    public DefaultThreadPool() {
        initWorkers(workNum);
    }

    public DefaultThreadPool(int num) {
        this.workNum = num > MAX_WORKERS_NUM ? MAX_WORKERS_NUM : num < MIN_WORKERS_NUM ? MIN_WORKERS_NUM : num;
        initWorkers(workNum);
    }

    // 初始化工作线程
    private void initWorkers(int workNum) {
        for (int i = 0; i < workNum; i++) {
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker, "线程:" + threadNum.incrementAndGet());
            thread.start();
        }
    }

    @Override
    public void execute(Job job) {
        if (job != null) {
            synchronized (jobs) {
                jobs.add(job);
                jobs.notify();
            }
        }
    }

    @Override
    public void shutDown() {
        for (Worker work : workers) {
            work.shutDown();
        }
    }

    @Override
    public void addWorkers(int num) {
        synchronized (jobs) {
            // 如果增加num超过了最大的线程数量,则最多增加到MAX_WORKER_NUM
            if (num + this.workNum > MAX_WORKERS_NUM) {
                num = MAX_WORKERS_NUM - this.workNum;
            }
            initWorkers(num);
            this.workNum += num;
        }
    }

    @Override
    public void removeWorks(int num) {
        if (num > this.workNum) {
            throw new IllegalArgumentException("移除的工作线程数量大于当前的线程数量");
        }
        synchronized (jobs) {
            for (int i = 0; i < num; i++) {
                Worker worker = workers.get(i);
                workers.remove(worker);
                worker.shutDown();
            }
            this.workNum -= num;
        }

    }

    @Override
    public int getJobSize() {
        return jobs.size();
    }

    /**
     * 工作者线程,负责消费任务
     */
    class Worker implements Runnable {

        private volatile boolean flag = true;

        @Override
        public void run() {
            while (flag) {
                synchronized (jobs) {
                    //如果任务队列为空,工作线程则等待
                    while (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 任务队列不为空,取出任务进行执行
                    Job job = jobs.removeFirst();
                    if (job != null) {
                        job.run();
                    }
                }
            }
        }

        public void shutDown() {
            flag = false;
        }
    }
}

