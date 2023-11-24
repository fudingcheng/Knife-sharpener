package cn.itcast.interfaceDemo5;

interface Inter1 {
    public void a();
}

interface Inter2 {
    public void a();
}

interface Inter3 extends Inter1, Inter2 {

}

interface Inter4 {
    public default void a() {
        System.out.println("这是Inter4接口中的默认方法");
    }
}

interface Inter5 {
    public default void a() {
        System.out.println("这是Inter5接口中的默认方法");
    }
}

abstract class AbstractClass {
    public void a() {
        System.out.println("这是父类中的默认方法");
    }
}

class Test_ implements Inter4,Inter5 {
    public void a() {
        System.out.println("这是Test_中的默认方法");
    }
}

/**
 * 子类继承了父类,实现了接口,如果父类和接口中有相同签名的方法,则会默认调用父类的抽象方法
 */
class Test extends AbstractClass implements Inter4 {

}

/**
 * 接口的使用注意事项
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("测试...");
        Test test = new Test();
        test.a();
        System.out.println("-----");
        Test_ test_ = new Test_();
        test_.a();
    }
}

class Impl implements Inter1, Inter2 {

    @Override
    public void a() {

    }
}
