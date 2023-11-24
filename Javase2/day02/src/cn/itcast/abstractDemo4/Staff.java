package cn.itcast.abstractDemo4;

/**
 * 模板设计模式:员工类
 */
public abstract class Staff {
    public String name;
    public int age;

    public Staff() {
    }



    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void show() {
        System.out.println("我的名字是:" + name + ",我今年" + age + "岁");
        doWork();
    }

    protected abstract void doWork();
}
