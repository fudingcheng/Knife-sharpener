package cn.itcast.extendsdemo8;

/**
 * 同一个类中,可以通过this调用同类中的兄弟构造方法
 */
public class Test3 {
    public static void main(String[] args) {
        Student student1 = new Student("张三");
        System.out.println(student1);

        System.out.println("---------------------");
        Student student2 = new Student("张三", 35, "百度");
        System.out.println(student2);
    }
}

class Student {
    private String name;
    private int age;
    private String schoolName;

    public Student(String name) {
        this(name, 30, "黑马程序员");
    }

    public Student() {
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}


