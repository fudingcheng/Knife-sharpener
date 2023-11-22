package cn.itcast.t9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 让线程按照顺序执行
 */
public class JoinThread {

    private static Logger logger = LoggerFactory.getLogger(JoinThread.class);

    public static void main(String[] args) {
        Thread preThread = Thread.currentThread();
        for (int i = 1; i <= 10; i++) {
            JoinJob job = new JoinJob(preThread);
            Thread thread = new Thread(job, String.valueOf(i));
            thread.start();
            preThread = thread;
        }
        logger.info("main线程执行了");
    }

static class JoinJob implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(JoinThread.class);

    private Thread preThread;

    public JoinJob(Thread thread) {
        this.preThread = thread;
    }

    @Override
    public void run() {
        try {
            preThread.join();   //让一个线程执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(Thread.currentThread().getName() + "线程执行了");
    }
}
}

