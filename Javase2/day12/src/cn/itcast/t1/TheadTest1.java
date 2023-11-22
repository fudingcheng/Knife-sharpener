package cn.itcast.t1;

public class TheadTest1 {

    public static void main(String[] args) {
        //创建线程对象
        MyThread myThread = new MyThread();


        //启动线程
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.err.println("主线程在执行："+i);
        }


    }

}
