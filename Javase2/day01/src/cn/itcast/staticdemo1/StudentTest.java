package cn.itcast.staticdemo1;

/**
 * static:静态
 */
public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student.name = "张三";
        s1.age = 18;
        System.out.println(s1.age);
        System.out.println(s1.name);

        Student s2 = new Student();
        Student.name = "李四";
        s2.age = 20;
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println("---------");
        System.out.println(s1.name);



    }
}
