package cn.itcast.quickstart;

/**
 * 学生类
 */
public class Student {
    // 类的属性
    String name;        //记录学生名称
    double chinese;     //记录学生语文成绩
    double math;        //记录学生数学成绩


    //类的方法

    //计算总成绩
    public void printTotalScore() {
        System.out.println(name + "的总成绩是:" + (chinese + math));
    }

    // 计算平均成绩
    public void printAvgScore() {
        System.out.println(name + "的平均成绩是:" + (chinese + math) / 2.0);
    }
}

