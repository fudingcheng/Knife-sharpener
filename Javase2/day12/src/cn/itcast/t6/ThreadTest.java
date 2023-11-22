package cn.itcast.t6;

public class ThreadTest {
    public static void main(String[] args) {

        // 创建Desk对象
        Desk desk = new Desk();

        // 创建3个厨师的线程，在线程中调用放包子的方法
        new Thread(() -> {
            while (true){
                desk.put();
            }
        }, "厨师1").start();

        new Thread(() -> {
            while (true){
                desk.put();
            }
        }, "厨师2").start();

        new Thread(() -> {
            while (true){
                desk.put();
            }
        }, "厨师3").start();

        // 创建2个吃货的线程，在线程中调用吃包子的方法

        new Thread(()->{
            while (true){
                desk.get();
            }
        },"吃货1").start();

        new Thread(()->{
            while (true){
                desk.get();
            }
        },"吃货2").start();

    }
}
