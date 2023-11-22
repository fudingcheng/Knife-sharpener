package cn.itcast.extendsdemo6;


public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.method1();
        fu.method2();

        System.out.println("-------");

        Zi zi  = new Zi();
        zi.method1();
        zi.method2();

        System.out.println("------");

        Student zs = new Student("zs", 20);
        System.out.println(zs);
    }
}
