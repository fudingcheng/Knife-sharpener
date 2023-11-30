package cn.itcast.object;

/**
 * Object的toString和equals方法
 */
public class Test {

    public static void main(String[] args) {
        Student student1 = new Student("张三", 30);
        System.out.println(student1);

        Student student2 = new Student("张三", 30);
        System.out.println(student2 == student1);
        System.out.println(student1.equals(student2));
    }

}
