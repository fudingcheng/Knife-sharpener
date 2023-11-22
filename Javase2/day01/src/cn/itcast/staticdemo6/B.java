package cn.itcast.staticdemo6;

/**
 * 单例设计模式:懒汉式
 */
public class B {
    // 提供静态类成员变量
    static B b;

    // 私有化构造方法
    private B() {

    }

    // 提供静态方法返回A对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
