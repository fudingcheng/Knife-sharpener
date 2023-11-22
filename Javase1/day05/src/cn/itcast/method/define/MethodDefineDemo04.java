package cn.itcast.method.define;

import java.util.Scanner;

/**
 * 方法的设计：
 * 1、需不需要参数
 * 2、需不需要返回值
 * 3、方法体如何实现
 */
public class MethodDefineDemo04 {

    public static void main(String[] args) {
        int rs1 = sum(100);
        System.out.println("1-100的和是：" + rs1);

        int rs2 = sum(500);
        System.out.println("1-500的和是：" + rs2);

        System.out.println("--------");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数:");
//        int inputData = scanner.nextInt();

        String rs3 = judge(10);     // 实参；实际传递的值
        System.out.println( "10是：" + rs3);

//        String rs4 = judge(4);
//        System.out.println("4是："+rs4);
    }

    /**
     * 需求：求1-n的和
     * 1、需要参数：n，类型int
     * 2、需要返回值，把1-n的和计算出来返回，类型int
     * 3、业务实现1-n的和
     */

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 需求：判断一个数是奇数还是偶数
     * 1、需要传递参数，参数就是判断的数num
     * 2、需要返回值，就是把判断的结果[奇数/偶数]返回，类型就是字符串
     * 3、业务实现
     */
    public static String judge(int num) {       // num就是形参
        if (num % 2 == 0) {
            return "偶数";
        } else {
            return "奇数";
        }
    }

}
