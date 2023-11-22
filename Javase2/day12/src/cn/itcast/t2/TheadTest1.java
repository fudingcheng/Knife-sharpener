package cn.itcast.t2;

public class TheadTest1 {

    public static void main(String[] args) throws InterruptedException {
        //创建线程对象
        MyThread myThread1 = new MyThread("myThread1");
        // 靖东蒙线程启动
        myThread1.start();



        //创建线程对象
        MyThread myThread2 = new MyThread("myThread2");
        // 靖东蒙线程启动
        myThread2.start();

        // 主线程要依赖子线程执行的结果，就要用join方法
        myThread1.join();
        myThread2.join();




        for (int i = 0; i < 5; i++) {
            System.err.println(Thread.currentThread().getName() + "在执行：" + i);
        }


    }

}
