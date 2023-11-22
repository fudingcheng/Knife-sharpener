package cn.itcast.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 数组案例:打乱数组中的元素顺序
 */
public class ArrayDemo10 {

    public static void main(String[] args) {
        // 拆解

        // 1. 创建动态的数组,用来存放录入的员工的工号
        int[] scores = new int[5];

        // 2. 创建Scanner对象,录入员工的工号
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始依次输入员工的工号");
        // 3.依次录入5个员工工号
        // 遍历数据中的每个元素
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工工号:");
            int score = scanner.nextInt();
            scores[i] = score;
        }

        System.out.print("数组随机排序前:");
        // 遍历数组中的数据
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        // 打乱数组中元素的个数
        /**
         * 思路:
         *  1. 遍历数组中的每个元素 arr[i]
         *  2. 从数据中随机取出一个数;arr[randomIndex]
         *  3. 将arr[i]的值与arr[randomIndex]交换
         */
        // 创建随机数对象,用来生成数组的随机索引
        Random random = new Random();
        // 1. 遍历数组中的每个元素 arr[i]
        for (int i = 0; i < scores.length; i++) {
            // 从数据中随机取出一个数
            int randomIndex = random.nextInt(scores.length);    // 生成随机的索引
            // 定义一个变量,用来交换数据
            int temp = scores[i];
            scores[i] = scores[randomIndex];
            scores[randomIndex] = temp;
        }
        System.out.println();       //换行
        System.out.print("数组随机排序后:");
        // 遍历数组中的数据
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
