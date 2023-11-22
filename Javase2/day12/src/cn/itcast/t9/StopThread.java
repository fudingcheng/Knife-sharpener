package cn.itcast.t9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 停止线程
 * 1. 通过标记来中断线程
 * 2. 通过stop停止线程
 * 3. 中断线程(包括阻塞线程和非阻塞线程)
 * 3.1 中断正常的线程,会把线程中中断标记改为true
 * 3.2 中断阻塞的线程,会抛出异常
 */
public class StopThread {

    private static Logger logger = LoggerFactory.getLogger(StopThread.class);

    private volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        // stopThreadByFlag();
        // stopThreadByStopMethod();
        //interruptNormalThread();
        interruptBlockThread();
    }

    private static void interruptBlockThread() throws InterruptedException {
        Thread t4 = new Thread(() -> {
            boolean interrupted = Thread.currentThread().isInterrupted();
            while (!interrupted) {
                logger.info("t4线程执行了...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
//                    e.printStackTrace();

                    // 执行一些未完成的事情
                    interrupted = true;     //更改中止标志
                }
            }
            logger.info("t4线程终止了...");
        }, "t4");

        t4.start();

        TimeUnit.SECONDS.sleep(1);

        t4.interrupt();

        logger.info("t4的interrupt状态是:" + t4.isInterrupted());


    }

    private static void interruptNormalThread() throws InterruptedException {

        Thread t3 = new Thread(() -> {
            boolean interrupted = Thread.currentThread().isInterrupted();
            while (!interrupted) {
                logger.info("t3线程运行中....");
                interrupted = Thread.currentThread().isInterrupted();
            }
            logger.info("t3线程终止了...");
        }, "t3");

        t3.start();

        TimeUnit.SECONDS.sleep(2);

        t3.interrupt();

        logger.info("t3的interrupt状态是:" + t3.isInterrupted());

    }

    private static void stopThreadByStopMethod() throws InterruptedException {

        Thread t2 = new Thread(() -> {
            while (flag) {
                logger.info("t2线程运行中...");
            }
            logger.info("t2线程终止了...");
        }, "t2线程");

        t2.start();

        TimeUnit.SECONDS.sleep(2);

        t2.stop();

    }

    private static void stopThreadByFlag() throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                logger.info("t1线程运行中...");
            }
            logger.info("t1线程终止了...");
        }, "t1线程").start();

        // 主线程休眠2秒,并把标志改为false
        TimeUnit.SECONDS.sleep(2);
        flag = false;

    }

}
