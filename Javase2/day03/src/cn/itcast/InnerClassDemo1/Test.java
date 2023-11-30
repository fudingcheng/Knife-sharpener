package cn.itcast.InnerClassDemo1;

/**
 * 内部类测试
 */
public class Test {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.test2();
    }

}
