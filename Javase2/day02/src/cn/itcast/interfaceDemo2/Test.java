package cn.itcast.interfaceDemo2;

interface Driver {
    public void drive();
}

interface Singer {
    public void sing();
}

class A implements Driver {

    @Override
    public void drive() {
        System.out.println("我会开车");
    }
}

class B implements Singer, Driver {

    @Override
    public void sing() {
        System.out.println("我会唱歌");
    }

    @Override
    public void drive() {
        System.out.println("我会开车");
    }
}

/**
 * 接口的好处
 */
public class Test {

    public static void main(String[] args) {
        A a = new A();
        a.drive();

        System.out.println("--------");

        B b = new B();
        b.sing();
        b.drive();
    }

}

