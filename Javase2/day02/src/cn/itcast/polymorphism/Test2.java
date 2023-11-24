package cn.itcast.polymorphism;

/**
 * 测试类:多态的应用场景
 */
public class Test2 {
    public static void main(String[] args) {
//        People people = new People();
//        People people = new Student();
        People people = new Teacher();
        go(people);

    }

    public static void go(People people) {
        System.out.println("-----开始------");
        people.run();
        if (people instanceof Student) {
            Student student = (Student) people;
            student.study();
        } else if (people instanceof Teacher) {
            Teacher teacher = (Teacher) people;
            teacher.teach();
        }
        System.out.println("-----结束------");
    }

}
