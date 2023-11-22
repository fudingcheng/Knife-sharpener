package cn.itcast.t9;

import java.util.concurrent.TimeUnit;

/**
 * 演示线程的状态
 */
public class ThreadStatus {

    public void main(String[] args) {
        new Thread(new Sleep(), "Sleep线程").start();
        new Thread(new Waitting(), "Waitting线程").start();
        new Thread(new Block(), "阻塞线程1").start();
        new Thread(new Block(), "阻塞线程2").start();
    }

/*
 * 线程运行此任务,则一直会睡眠
 */
static class Sleep implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 线程运行此任务,则一直会等待
 */
static class Waitting implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Waitting.class) {
                try {
                    Waitting.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 线程执行此任务,则有可能会进入到阻塞状态
 */
static class Block implements Runnable {

    @Override
    public void run() {
        while (true) {
            synchronized (Block.class) {
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
}



