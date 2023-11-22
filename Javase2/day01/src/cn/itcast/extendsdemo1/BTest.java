package cn.itcast.extendsdemo1;

/**
 * 测试继承
 */
public class BTest {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);

        System.out.println("--------------");
        b.print1();
        b.print3();
    }
}
