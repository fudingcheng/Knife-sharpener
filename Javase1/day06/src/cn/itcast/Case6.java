package cn.itcast;

import java.util.Random;
import java.util.Scanner;

/**
 * 抢红包;{10,20,30,40,50}
 */
public class Case6 {
    public static void main(String[] args) {
        int[] redPackage = {10, 20, 30, 40, 50};
        System.out.println("抢红包开始....");
        // 抢红包
        vieRedPackage(redPackage);
        System.out.println("抢红包结束...");

    }

    // 抢红包;{10,20,30,40,50}
    private static void vieRedPackage(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请按任意的键开始抢红包:");
        // 创建随机数对象
        Random random = new Random();
        //1. 循环arr.length次,抢红包的次数
        for (int i = 0; i < arr.length; i++) {      // {10, 20, 30, 40, 50};
            scanner.next(); //按键-开始抢红包
            while (true) {        // 死循环抢红包,什么时候退出死循环?抢到非0的值就退出
                // 随机产生一个索引
                int randomNum = random.nextInt(5);
                // 该红包已经被抢了
                if (arr[randomNum] != 0) {
                    System.out.println("抢到了" + arr[randomNum] + "元");
                    // 抢到红号后,就把钱拿走,元素值改为0
                    arr[randomNum] = 0;
                    break;      //结束死循环
                }
            }
        }
    }
}
