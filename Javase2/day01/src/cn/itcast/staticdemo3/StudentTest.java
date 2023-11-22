package cn.itcast.staticdemo3;

/**
 * 代码块测试
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("zs");
        Student s2 = new Student("lisi");

        System.out.println(Student.schoolName);
        System.out.println(s1.name);
        System.out.println("-------------");
        System.out.println(s2.name);
    }
}
