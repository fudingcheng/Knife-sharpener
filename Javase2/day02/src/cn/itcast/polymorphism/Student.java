package cn.itcast.polymorphism;

/**
 * 子类:学生
 */
public class Student extends People {

    String name = "学生";

    @Override
    public void run() {
        System.out.println("学生跑的快");
    }

    public void study() {
        System.out.println(name + "学习...");
    }
}
