package cn.itcast.t9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 面试题:线程的唤醒和唤醒全部
 */
public class NotifyAndNotifyAll {

    private static Logger logger = LoggerFactory.getLogger(NotifyAndNotifyAll.class);

    //创建锁对象
    private static Object lock = new Object();

    public static void main(String[] args) {

        // 创建2个线程, 线程内部使用等待
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                logger.info("t1等待了...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("t1被唤醒了...");
            }
        }, "t1");


        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                logger.info("t2等待了...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                logger.info("t2被唤醒了...");
            }
        }, "t2");

        // 启动2个线程
        t1.start();
        t2.start();

        // 在主线程中测试notify和notifyAll
        synchronized (lock) {
//            lock.notify();
            lock.notifyAll();
        }

    }

}
