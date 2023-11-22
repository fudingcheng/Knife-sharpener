package cn.itcast.t11;

/**
 * 线程池接口
 */
public interface ThreadPool<Job extends Runnable> {

    // 执行任务
    void execute(Job job);

    // 关闭线程池
    void shutDown();

    // 增加工作者线程
    void addWorkers(int num);

    // 减少工作者线程
    void removeWorks(int num);

    // 得到正在等待执行的任务数量
    int getJobSize();

}