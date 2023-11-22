package cn.itcast.t1;

public class ThreadTest2_2 {
    public static void main(String[] args) {
        // 匿名内部类的方式
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程在执行："+i);
                }
            }
        }).start();
*/

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程在执行："+i);
            }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.err.println("主线程在执行："+i);
        }
    }
}
