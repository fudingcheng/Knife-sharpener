package cn.itcast.extendsdemo8;

/**
 * 继承中的子类构造器调用父类构造器
 * 子类对象的初始化时,必须先调用父类的构造器
 */
public class Test1 {
    public static void main(String[] args) {
        Zi zi1 = new Zi();
        System.out.println("-------------");
        Zi zi2 = new Zi("zs", 123);
    }
}

class Fu {
//    public Fu() {
//        System.out.println("父类无参构造执行了...");
//    }

    public Fu(String name, int age) {
        System.out.println("父类有参构造执行了...");
    }
}

class Zi extends Fu{
    public Zi() {
        super("zs",123);
        System.out.println("子类无参构造执行了...");
    }

    public Zi(String name, int age) {
        super(name,age);
        System.out.println("子类有参构造方法执行了...");
    }
}
