package cn.itcast;

import java.util.Scanner;

/**
 * 数字加密
 */
public class Case4 {

    public static void main(String[] args) {

        String number = encrypt(8346);

        System.out.println(number);
    }

    private static String encrypt(int num) {
        int[] arr = new int[4];

        //1. 取出num中的每个数
        arr[0] = num / 1000 % 10;
        arr[1] = num / 100 % 10;
        arr[2] = num / 10 % 10;
        arr[3] = num % 10;

        // 2. 遍历数组,加密每个数
        for (int i = 0; i < arr.length; i++) {
            // 对每个数加密了
            arr[i] = (arr[i] + 5) % 10;
        }

        // 3. 反转数组
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 反转-替换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //4. 把数组中每个数拼接起来
        String code = "";
        for (int i = 0; i < arr.length; i++) {
            code += arr[i];
        }

        return code;
    }

}

