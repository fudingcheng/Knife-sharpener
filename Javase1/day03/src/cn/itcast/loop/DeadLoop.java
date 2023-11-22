package cn.itcast.loop;

/**
 * 死循环
 */
public class DeadLoop {
    public static void main(String[] args) {
        // for实现死循环
//        for (;;){
//            System.out.println("123");
//        }

        // while写法
//        while (true) {
//            System.out.println("123");
//        }

        // do...while的死循环
        do {
            System.out.println("123");
        } while (true);
    }
}
