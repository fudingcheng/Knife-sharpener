package cn.itcast.homework;

import java.util.Scanner;

/*
	分析以下需求并完成代码
        共有6个评委给1名选手打分, 分数为键盘录入的[1-100]之间的整数
        对录入的分数进行判断, 超出范围则给出错误提示, 并重新录入
        将分数存储到合适的数组中
        去掉一个最高分去掉一个最低分, 计算该选手的平均分并在控制台打印
*/
public class HomeWork1 {
    public static void main(String[] args) {
        // 对需求进行拆解

        //1、创建动态数组，用来存储评委的打分
        int[] arr = new int[6];

        //2、循环给数组中录入数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始录入打分");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "个评委录入分数：");
            while (true) {
                // 接受键盘录入的数据
                int score = scanner.nextInt();
                // 分数在1-100之间是合法，否则就非法，非法就要提示用户重新录入
                if (score >= 1 && score <= 100) { //合法
                    arr[i] = score;
                    break;
                } else { //非法
                    System.out.println("数据不合法， 请录入1-100之间的数");
                }
            }
        }

        // 求数组的最大值、最小值、总和
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {     // 如果遍历的值大于max，将max的值更新为arr[i]
                max = arr[i];
            }
            if (arr[i] < min) {     // 如果遍历的值小于min，将min的值替换为arr[i]
                min = arr[i];
            }
            sum += arr[i];          // 求总和
        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("总和：" + sum);
        System.out.println("去掉最高分和最低分的平均分是：" + (sum - max - min) / (arr.length - 2));
    }
}
