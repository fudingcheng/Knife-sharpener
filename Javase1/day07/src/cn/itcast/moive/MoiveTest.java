package cn.itcast.moive;

import java.util.Scanner;

/**
 * 电影的测试类f'd
 */
public class MoiveTest {
    public static void main(String[] args) {
        //1. 封装电影的数据
        Moive moive1 = new Moive(1, "出拳吧,妈妈", "唐晓白", "谭卓", "直径女性力量", 7.9);
        Moive moive2 = new Moive(2, "一点就到家", "许宏宇", "刘昊然", "电商新时代", 8.7);
        Moive moive3 = new Moive(3, "月球陨落", "罗兰", "哈莉", "脑洞打开", 7.9);

        //将3个电影放到数组中
        Moive[] moives = {moive1, moive2, moive3};


        //2. 处理电影的数据
        // 创建电影处理类
        MoiveOperator moiveOperator = new MoiveOperator(moives);


        // 测试:打印所有的电影信息
        moiveOperator.printAllMoiveMessages();

        // 测试:查询id为3的电影是什么电影
        moiveOperator.getMoiveById(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎登录系统!");

    }
}
