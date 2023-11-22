package cn.itcast.staticdemo6;

/**
 * 测试懒汉式
 */
public class ATest {
    public static void main(String[] args) {
//        A a = new A();      // 不可直接访问

        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1 == a2);
    }


}
