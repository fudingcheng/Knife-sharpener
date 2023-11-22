package cn.itcast.homework.case3;


import java.util.ArrayList;

/**
 * 学生操作类:
 * 1. 把学生添加集合中
 * 2. 打印集合中总分超过150分的学生
 */
public class StudentOperator {

    // 创建集合容器
    private ArrayList<Student> studentList = new ArrayList<Student>();

    /**
     * add方法:将学生对象添加到集合中
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }

    /**
     * show:打印总分超过150分的学生
     */
    public void printStudent() {
        System.out.println("以下学生的总分大于150分:");
        // 遍历集合
        for (int i = 0; i < studentList.size(); i++) {
            // 获取集合中的每一个student对象
            Student student = studentList.get(i);
            // 判断当前学生的总分是否超过150
            if ((student.getEnglish() + student.getChinese()) > 150) {
                // 打印当前学生的信息
                System.out.println(student.getName() + "-" + student.getChinese() + "-" + student.getEnglish());
            }
        }
    }
}
