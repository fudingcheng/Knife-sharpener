package cn.itcast.abstractDemo4;

/**
 * 讲师类
 */
public class Lecturer extends Staff {


    public Lecturer(String name, int age) {
        super(name, age);
    }

    @Override
    protected void doWork() {
        System.out.println("我在讲课...");
    }
}
