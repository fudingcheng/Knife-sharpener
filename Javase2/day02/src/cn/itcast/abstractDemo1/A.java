package cn.itcast.abstractDemo1;

/**
 * 抽象类初识:
 * 1. 抽象类中不一定有抽象方法
 * 2. 抽象方法所在的类必须是抽象类
 */
public abstract class A {
    private String name;

    /**
     * 抽象方法,没有方法体
     */
    public abstract void test();

}
