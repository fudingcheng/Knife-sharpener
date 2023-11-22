package cn.itcast.t7;

import java.util.concurrent.*;

/**
 * 测试线程池,处理不带返回值的任务
 */
public class ThreadPoolTest2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //1. 创建线程池对象
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,          // 核心线程数量:3个
                5,      // 最大线程数量:5个,包含额外创建2个临时线程
                2,
                TimeUnit.SECONDS,       // 临时线程存活时间2秒

                new ArrayBlockingQueue<>(4),    // 存放任务的队列,容量是4
                Executors.defaultThreadFactory(),       // 创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy());  // 拒绝策略


        //2. 让线程池执行任务
        System.out.println(threadPoolExecutor.submit(new MyCallable(10)).get());
        System.out.println(threadPoolExecutor.submit(new MyCallable(100)).get());
        System.out.println(threadPoolExecutor.submit(new MyCallable(1000)).get());
        System.out.println(threadPoolExecutor.submit(new MyCallable(10000)).get());


        // 线程复用
        threadPoolExecutor.shutdown();

    }

}
