package cn.itcast.t9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SellTicket {


    private static Logger logger = LoggerFactory.getLogger(SellTicket.class);

    public static void main(String[] args) {

//        ThreadSync();

        new Thread(() -> {
            Object obj = new Object();
            synchronized (obj) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    logger.info("第一次进入锁");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(2000);
                        logger.info("第二次进入锁");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();
    }

    private static void ThreadSync() {
        SellJob job = new SellJob();
        for (int i = 1; i <= 1; i++) {
            new Thread(job, String.valueOf(i)).start();
        }
    }


static class SellJob implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(SellJob.class);

    private int ticket = 10;

    @Override
    public void run() {

        while (true) {
            // 在此处睡眠是为了再次获得锁前有个等待,和其他线程公平竞争
            try {
                TimeUnit.MILLISECONDS.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (ticket <= 0) {
                    break;
                }
                ticket--;
                logger.info(Thread.currentThread().getName() + "窗口卖票成功,还剩" + ticket + "张票");

            }
        }
    }
}

}
