package cn.itcast.interfaceDemo3;

import java.util.List;

/**
 * 实现方案二
 */
public class StudentOperatorImpl2 implements StudentOperator {


    /**
     * 打印学生信息,并且打印出男生人数/女生人数/总人数
     *
     * @param students
     */
    @Override
    public void printAllInfo(List<Student> students) {
        System.out.println("======全部学生的信息如下======");
        int menCount = 0;
        int womenCount = 0;
        int totalCount = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
            if (student.getSex() == '男') {
                menCount++;
            } else if (student.getSex() == '女') {
                womenCount++;
            }
            totalCount++;
        }
        System.out.println("男生有:"+menCount+"人");
        System.out.println("女生有:"+menCount+"人");
        System.out.println("总人数有:"+totalCount+"人");

    }

    /**
     * 求去掉最大值和最小值后的平均值
     *
     * @param students
     */
    @Override
    public void printAvgScore(List<Student> students) {
        System.out.println("======学生的平均成绩如下:======");
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        double total = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getScore() > max) {
                max = student.getScore();
            }

            if (student.getScore() < min) {
                min = student.getScore();
            }
            total += student.getScore();
        }

        System.out.println("最高成绩是:" + max);
        System.out.println("最低成绩是:" + min);
        System.out.println("去掉最高成绩和最低成绩后的平均成绩是:" + (total - max - min) / (students.size() - 2));

    }
}
