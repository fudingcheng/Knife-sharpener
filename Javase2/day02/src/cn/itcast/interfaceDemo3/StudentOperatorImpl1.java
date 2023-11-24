package cn.itcast.interfaceDemo3;

import java.util.List;

/**
 * 实现方案一
 */
public class StudentOperatorImpl1 implements StudentOperator {
    @Override
    public void printAllInfo(List<Student> students) {
        System.out.println("======学生的全部信息如下:======");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
    }

    @Override
    public void printAvgScore(List<Student> students) {
        System.out.println("======学生的平均成绩如下:======");
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            count += student.getScore();
        }
        System.out.println(count / students.size());
    }
}
