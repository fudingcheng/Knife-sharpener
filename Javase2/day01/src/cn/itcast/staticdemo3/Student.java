package cn.itcast.staticdemo3;

/**
 * 代码块
 */
public class Student {
    static int number;
    static String schoolName;

    /**
     * 初始化类成员变量
     */
    static {
        System.out.println("静态代码块执行了...");
        schoolName = "黑马";
        number++;
    }

    String name;
    int age;

    /**
     * 初始化实例成员变量
     */ {
        System.out.println("实例代码块执行了...");
        age = 18;
    }

    public Student() {
        System.out.println("无参构造方法执行了");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("有参构造方法执行了");
    }

}
