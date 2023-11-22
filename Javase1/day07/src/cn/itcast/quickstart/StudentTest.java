package cn.itcast.quickstart;

/**
 * 需求：处理学生的数据，计算学生的总成绩和平均成绩
 */
public class StudentTest {
    public static void main(String[] args) {
        //1. 创建学生对象
        Student s1 = new Student();
        s1.name = "zs";
        s1.chinese = 100;
        s1.math = 70;

        //2. 调用学生对象处理数据
        s1.printTotalScore();
        s1.printAvgScore();

        System.out.println("-------");
        // 创建李四这个对象
        Student s2 = new Student();
        s2.name = "ls";
        s2.chinese = 80;
        s2.math = 50;

        // 处理李四的数据
        s2.printTotalScore();
        s2.printAvgScore();

    }
}
