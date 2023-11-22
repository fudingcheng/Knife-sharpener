package cn.itcast.t1;

public class ThreadTest2 {
    public static void main(String[] args) {
        //1、创建任务类对象
        MyRunnable myRunnable = new MyRunnable();

        //2、创建一个线程对象，把任务类对象交给线程
        Thread thread = new Thread(myRunnable);

        //3、启动线程
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.err.println("主线程在执行："+i);
        }
    }
}
