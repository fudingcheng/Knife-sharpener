package cn.itcast.array;

import java.util.Random;

/**
 * 生成1-100之间的随机数,奇数放左边,偶数放右边
 */
public class ArrayDemo11 {
    public static void main(String[] args) {
        // 创建长度为10的数组
        int[] arr = new int[10];

        // 放入1-100之间随机的10个数
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100) + 1;
            arr[i] = num;
        }

        System.out.print("排序前:");
        // 打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 计算偶数和奇数的个数
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {  // 打印奇数的个数
                oddCount++;  //奇数个数
            }
        }
        int evenCount = arr.length - oddCount;         // 偶数个数

        //创建奇数数组和偶数数组
        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];

        //计算下奇数和偶数的个数
        oddCount = 0;
        evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddArr[oddCount] = arr[i];
                oddCount++;
            } else {
                evenArr[evenCount] = arr[i];
                evenCount++;
            }
        }

        // 遍历oddArr,把奇数放在arr的左边
        for (int i = 0; i < oddArr.length; i++) {
            arr[i] = oddArr[i];
        }

        // 遍历evenArr,把偶数放在右边
        for (int i = 0; i < evenArr.length; i++) {
            arr[oddCount] = evenArr[i];
            oddCount++;
        }

        System.out.println();

        System.out.print("排序后:");
        // 打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
