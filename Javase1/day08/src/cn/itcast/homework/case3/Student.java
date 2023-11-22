package cn.itcast.homework.case3;

/**
 * 学生的实体类:创建学生对象,封装学生数据
 */
public class Student {
    private String name;    //姓名
    private double english; //英语成绩
    private double chinese; // 语文成绩

    public Student() {
    }

    public Student(String name, double english, double chinese) {
        this.name = name;
        this.english = english;
        this.chinese = chinese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }
}
