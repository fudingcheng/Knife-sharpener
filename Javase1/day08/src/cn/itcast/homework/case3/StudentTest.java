package cn.itcast.homework.case3;

/**
 * 测试学生业务
 */
public class StudentTest {
    public static void main(String[] args) {
        //1. 创建学生操作类对象
        StudentOperator studentOperator = new StudentOperator();

        //2. 测试add方法
        Student student1 = new Student("张三", 88, 89);
        Student student2 = new Student("李四", 85, 78);
        Student student3 = new Student("王麻子", 86, 50);
        studentOperator.addStudent(student1);
        studentOperator.addStudent(student2);
        studentOperator.addStudent(student3);

        //3.测试show方法
        studentOperator.printStudent();
    }
}
