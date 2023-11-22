package cn.itcast.staticdemo6;

/**
 * 单例设计模式:饿汉式
 */
public class A {
    // 提供静态类成员变量
    static A a = new A();

    // 私有化构造方法
    private A() {

    }

    // 提供静态方法返回A对象
    public static A getInstance() {
        return a;
    }
}
