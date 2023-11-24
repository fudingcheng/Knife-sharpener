package cn.itcast.polymorphism;

/**
 * 测试类:多态
 */
public class Test {
    public static void main(String[] args) {

        People p = new People();
        p.run();

        System.out.println("----------");

        People p1 = new Teacher();
        p1.run();

        System.out.println("---------");

        People p2 = new Student();
        p2.run();
    }
}
