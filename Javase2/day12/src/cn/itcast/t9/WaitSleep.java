package cn.itcast.t9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 面试题:线程的等待和睡眠区别
 */
public class WaitSleep {

    private static Object lock = new Object();

    private static Logger logger = LoggerFactory.getLogger(WaitSleep.class);

    public static void main(String[] args) throws InterruptedException {
        //测试线程等待方法的调用归属
//        illegalWait();

        threadWait();

//        threadSleep();
        Thread.sleep(1000);
        synchronized (lock) {
            logger.info("main线程等待...");
            lock.wait(2000);
            logger.info("main线程唤醒...");
        }
    }

    private static void threadSleep() {
        new Thread(() -> {
            synchronized (lock) {
                logger.info("t2线程睡眠了");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("t2线程唤醒了");
            }
        }, "t2").start();
    }


    private static void threadWait() {
        new Thread(() -> {
            synchronized (lock) {
                logger.info("t1线程等待...");
                try {
                    lock.wait(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("t1线程唤醒...");
            }
        }, "t1").start();
    }

    private static void illegalWait() throws InterruptedException {
        synchronized (lock) {
            lock.wait();
        }
    }

}
