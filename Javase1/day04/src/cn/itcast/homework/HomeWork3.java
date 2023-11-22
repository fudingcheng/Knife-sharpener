package cn.itcast.homework;

import java.util.Random;
import java.util.Scanner;

/*
    分析以下需求并完成代码
        生成一个长度为10的数组, 元素为[1-100]之间的随机数, 遍历该数组
        按照偶数放右边奇数放左边(顺序不限)的规律, 将该数组元素重新排列到新数组, 并遍历新数组
*/
public class HomeWork3 {
    public static void main(String[] args) {
        // 对需求进行拆解

        //1、 生成一个长度为10的数组, 元素为[1-100]之间的随机数, 遍历该数组
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100) + 1;
            arr[i] = num;
        }

        System.out.print("排序前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 按照偶数放右边奇数放左边(顺序不限)的规律, 将该数组元素重新排列到新数组, 并遍历新数组
        // [1,2,3,4,5,6]
        // [1,3,5,6,4,2]
        // 定义2个变量，分别代表奇数的索引位置和偶数的索引位置
        int oddIndex = 0;
        int evenIndex = arr.length - 1;
        // 创建新数组
        int[] newArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // 偶数；从最大索引（arr.length-1）处向左排
                newArr[evenIndex] = arr[i];
                evenIndex--;        // 放置一个偶数后，下一个偶数就要往左边放，记录偶数索引的值就要--
            } else { //奇数：从最小索引(0)处往右排
                newArr[oddIndex] = arr[i];
                oddIndex++;     // 放置一个奇数后，下一个奇数就要往右边放，所以要对奇数索引++
            }
        }
        System.out.println();
        System.out.print("排序后：");
        // 遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
