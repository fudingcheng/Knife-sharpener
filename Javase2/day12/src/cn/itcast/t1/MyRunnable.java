package cn.itcast.t1;

/**
 * 线程创建方式二
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程在执行："+i);
        }
    }
}
