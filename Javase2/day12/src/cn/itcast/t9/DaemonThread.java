package cn.itcast.t9;

import java.util.concurrent.TimeUnit;

/**
 * 演示守护线程
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new DeamonJob(),"守护线程");
        thread.setDaemon(true);
        thread.start();
    }
static class DeamonJob implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}

