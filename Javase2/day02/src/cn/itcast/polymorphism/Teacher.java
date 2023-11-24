package cn.itcast.polymorphism;

/**
 * 子类:老师类
 */
public class Teacher extends People {
    String name = "老师";

    @Override
    public void run() {
        System.out.println("老师跑的慢");
    }

    public void teach() {
        System.out.println(name + "在上课");
    }

}
