package cn.itcast.t7;

import java.util.concurrent.*;

/**
 * 测试线程池,处理不带返回值的任务
 */
public class ThreadPoolTest {

    public static void main(String[] args) {

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
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());        // 以上3个任务由核心线程处理

        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());        // 以上4个任务在任务队列中等待核心线程来处理

        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());        // 以上2个任务就需要创建2个临时线程处理

        threadPoolExecutor.execute(new MyRunable());        // 临时线程和核心线程都在忙,这个任务就会被拒绝了
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());
        threadPoolExecutor.execute(new MyRunable());


        // 线程复用
        threadPoolExecutor.shutdown();
        // threadPoolExecutor.shutdownNow();

    }

}
