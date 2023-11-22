package cn.itcast.homework;

import java.util.Random;
import java.util.Scanner;

/*
	分析以下需求并完成代码
		定义一个长度为5的int类型数组arr, 数组元素为[7-67]之间的随机整数
		遍历数组arr, 打印所有元素
		提示用户输入[3-5]之间的一个整数num, 输入数字不需要判断
		筛选出数组arr中是num倍数的元素, 并打印在控制台 (没有则打印结果为空)
*/
public class HomeWork2 {
    public static void main(String[] args) {
        // 对需求进行拆解

        //1、定义一个长度为5的int类型数组arr, 数组元素为[7-67]之间的随机整数
        int[] arr = new int[5];

        // 遍历数组，给每个元素赋值
        // 创建随机数对象
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 生成7-67之间的随机数
            int num = random.nextInt(61) + 7;
            arr[i] = num;
        }

        // 2、遍历数组arr, 打印所有元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //3、提示用户输入[3-5]之间的一个整数num, 输入数字不需要判断
        System.out.println("请输入3-5之间的数：");
        // 创建键盘录入的对象
        Scanner scanner = new Scanner(System.in);
        int inputData = scanner.nextInt();

        //4、筛选出数组arr中是num倍数的元素, 并打印在控制台 (没有则打印结果为空)
        System.out.println("数组中是"+inputData+"的倍数数有：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % inputData == 0){    //满足条件的数
                System.out.print(arr[i]+" ");
            }
        }
    }
}
