package cn.itcast.interfaceDemo4;

/**
 * 接口的新特性
 */
public interface A {


    /**
     * 静态方法
     */
    public static void c() {
        System.out.println("这是一个静态方法");
    }

    /**
     * 默认方法
     */
    public default void a() {
        System.out.println("这是一个默认方法");
    }

    /**
     * 私有方法
     */
    private void b() {
        System.out.println("这是一个私有方法");
    }

    public void d();


}
