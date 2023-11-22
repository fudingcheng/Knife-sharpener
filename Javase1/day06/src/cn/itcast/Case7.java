package cn.itcast;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求:统计101-200之间有多少个素数,并输出素数
 */
public class Case7 {
    public static void main(String[] args) {

        int count = searchPrimeNumber(101, 200);
        System.out.println();
        System.out.println("---------");
        System.out.println(count);

    }

    /**
     * 找start-end之间的素数
     *
     * @param start
     * @param end
     * @return
     */
    private static int searchPrimeNumber(int start, int end) {

        int count = 0; // 统计素数的个数
        // 循环,从start循环到end,判断每个数
        for (int i = start; i <= end; i++) {            // 外层循环一次       取每个判断的数
            // 设置一个信号量,默认每个数都是素数
            boolean flag = true;
            // 判断从2到i/2之间有没有可以被整除的数
            for (int j = 2; j < i / 2; j++) {           // 内存循环一轮       用这个数不断地除 2 ~ i/2
                if (i % j == 0) {       // 不是素数
                    flag = false;
                    break;
                }
            }
            // 此时i就一定是素数
            if (flag) {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

}
