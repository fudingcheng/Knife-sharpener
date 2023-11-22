package cn.itcast.t7;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":执行了");
    }
}
