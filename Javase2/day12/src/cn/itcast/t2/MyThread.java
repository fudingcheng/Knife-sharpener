package cn.itcast.t2;

/**
 *多线程创建方式一
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        // this.setName(name);
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"在执行："+i);
        }
    }
}
