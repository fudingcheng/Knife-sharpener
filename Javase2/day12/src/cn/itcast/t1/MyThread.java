package cn.itcast.t1;

/**
 *多线程创建方式一
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程在执行："+i);
        }
    }
}
