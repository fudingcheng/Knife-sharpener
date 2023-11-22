package cn.itcast.homework;

import java.util.Random;    // 导包

/*
	分析以下需求并完成代码
		利用Random生成一个[10-100]之间的整随机数x，统计[10-x)之间奇数的个数
		最终在控制台打印所有的奇数以及个数
*/
public class HomeWork1 {
    public static void main(String[] args) {
        // 拆解-一步一步来做

        // 利用Random生成一个[10-100]之间的整随机数x
        //1. 创建Random对象
        Random random = new Random();
        //2.生成随机数; 10~100
        int x = random.nextInt(100 - 10 + 1) + 10;
        System.out.println("随机数是:" + x);
        // 统计[10-x)之间奇数的个数
        // 获取10~x之间的每个数
        // 定义一个变量,用来统计奇数的个数
        int count = 0;
        for (int i = 10; i < x; i++) {
            // 判断当前的数是不是奇数
            if (i % 2 == 1) {   // 代表当前的数就是个奇数
                count++;
                System.out.println(i);
            }
        }
        System.out.println("10到"+x+"之间的奇数的个数是:"+count+"个");
    }
}


