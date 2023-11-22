package cn.itcast.thisdemo;

/**
 * 学生类
 */
public class Student {

    double score;       // 成员变量,代表的是学生的成绩

    /**
     * 成员方法
     */
    public void printThis() {
        // this代表的就是当前的调用方法的对象地址值
        System.out.println(this);
    }

    // 判断学生的成绩是否到达分数线
    public void checkPass(double score) {    //代表的是分数线
        if (this.score > score) {      // 过线了
            System.out.println("恭喜您,分数过线了!");
        } else {  //代表没有过线
            System.out.println("不好意思,您的分数没过线!");
        }
    }

}

