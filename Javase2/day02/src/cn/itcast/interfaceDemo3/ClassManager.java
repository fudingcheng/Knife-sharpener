package cn.itcast.interfaceDemo3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ClassManager {
    StudentOperator studentOperator = new StudentOperatorImpl1();
    private List<Student> students = new ArrayList<Student>();

    public ClassManager() {
        Student student1 = new Student("张三", 20, '男');
        Student student2 = new Student("李四", 21, '男');
        Student student3 = new Student("王五", 22, '男');
        Student student4 = new Student("赵六", 23, '男');
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    public void printInfo() {
        studentOperator.printAllInfo(students);
    }

    public void printAvgScore() {
        studentOperator.printAvgScore(students);
    }

}

