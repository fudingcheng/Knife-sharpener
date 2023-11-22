package cn.itcast.constructor;

/**
 * 测试学生类
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建对象时,构造器方法会被执行
        Student s1 = new Student();
        s1.name = "zs";
        System.out.println(s1.name);

        System.out.println("------");

        // 通过构造器给对象的属性(成员变量)赋值
        Student s2 = new Student("ls");
        System.out.println(s2.name);

    }
}
