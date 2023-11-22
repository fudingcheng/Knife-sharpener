package cn.itcast.javabean;

/**
 * 学生操作类
 */
public class StudentOperator {

    // 学生对象作为成员变量
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    // 处理学生的总成绩
    public void printTotalScore() {
        System.out.println(student.getName() + "的总成绩是:" + (student.getChinese() + student.getMath()));       // name,chinese,math
    }


    // 处理学生的平均成绩
    public void printAvgScore() {
        System.out.println(student.getName() + "的平均成绩是:" + (student.getChinese() + student.getMath()) / 2.0);
    }

}
