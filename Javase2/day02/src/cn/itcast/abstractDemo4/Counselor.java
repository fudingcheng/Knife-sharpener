package cn.itcast.abstractDemo4;

/**
 * 咨询师类
 */
public class Counselor extends Staff {

    public Counselor() {
    }

    public Counselor(String name, int age) {
        super(name, age);
    }

    @Override
    protected void doWork() {
        System.out.println("我在回答问题");
    }
}
