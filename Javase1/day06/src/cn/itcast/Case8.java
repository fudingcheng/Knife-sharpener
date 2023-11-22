package cn.itcast;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求:双色球
 */
public class Case8 {
    public static void main(String[] args) {

        //1. 用户购买一组双色球
        int[] userNumberArray = selectUserNumberArray();

        //2. 开奖一组双色球
        int[] luckNumberArray = selectLuckNumberArray();

        //3. 兑奖
        compareArray(userNumberArray, luckNumberArray);

        int[] arr = {1,2,'3'};

    }


    // 给用户生成一组双色球
    private static int[] selectUserNumberArray() {
        // 1. 创建数组,长度6+1=7
        int[] userArray = new int[7];

        // 给数组中的每个位置添加值,前6位是红号(1-33),最后一位是蓝号(1-16)
        // 创建Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一组红号,范围是1-33之间的数");
        // 2. 先生成前6个红号
        for (int i = 0; i < userArray.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红号:");
            // 让用户循环录入数据
            while (true) {
                int redNumber = scanner.nextInt();
                if (redNumber >= 1 && redNumber <= 33) { //数字合法
                    // 判断数字是否存在
                    boolean rs = exist(userArray, redNumber);
                    if (!rs) {    //不存在
                        userArray[i] = redNumber;
                        break;  //结束死循环
                    } else {
                        // 号码在数组中存在,给用户一个提示,重新输入
                        System.out.println("您输入的数字重复,请重新输入:");
                    }
                } else {  //数字非法
                    System.out.println("您输入的红号有误,请输入1-33之间的数:");
                }
            }
        }

        // 3. 生成蓝号(1-16)
        while (true) {
            System.out.println("请输入一个蓝号,范围在1-16之间");
            int blueNumber = scanner.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {  //合法
                userArray[6] = blueNumber;
                break;
            } else { //不合法
                System.out.println("您输入的蓝号有误,请输入1-16之间的数:");
            }
        }

        return userArray;

    }

    /**
     * 判断数组中是否存在某个事
     *
     * @param arr
     * @param number
     * @return
     */
    private static boolean exist(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) { //存在
                return true;
            }
        }
        return false;
    }


    /**
     * 开奖一组双色球
     *
     * @return
     */
    private static int[] selectLuckNumberArray() {
        // 创建数组,存储开奖号码
        int[] luckNumberArray = new int[7];

        Random random = new Random();

        // 先生成6个红号
        for (int i = 0; i < luckNumberArray.length - 1; i++) {
            while (true) {
                // 随机生成1-33之间的数
                int redNumber = random.nextInt(33 - 1 + 1) + 1;
                if (!exist(luckNumberArray, redNumber)) {   // 生成的数在数组中不存在
                    luckNumberArray[i] = redNumber;
                    break;
                }
            }
        }

        // 再生成1个蓝号
        int blueNumber = random.nextInt(16 - 1 + 1) + 1;
        luckNumberArray[6] = blueNumber;

        return luckNumberArray;

    }

    /**
     * 兑奖:比较2个数组中的值是否一样
     *
     * @param userNumberArray
     * @param luckNumberArray
     */
    private static void compareArray(int[] userNumberArray, int[] luckNumberArray) {

        int redCount = 0;   // 记录红号的个数
        int blueCount = 0;  // 记录蓝号的个数

        // 先比较红号
        for (int i = 0; i < userNumberArray.length; i++) { //取出用户的每个红号
            for (int j = 0; j < luckNumberArray.length; j++) {  //与生成的所有的红号多比对下
                if (userNumberArray[i] == luckNumberArray[j]) {
                    redCount++;
                }
            }
        }

        // 再比较蓝号
        blueCount = userNumberArray[6] == luckNumberArray[6] ? 1 : 0;

        //打印用户的一组号码
        System.out.print("您的号码是:");
        printArray(userNumberArray);

        System.out.println();

        //打印中奖的一组号码
        System.out.print("中奖号码是:");
        printArray(luckNumberArray);

        System.out.println();

        System.out.println("红号中了" + redCount + "个");
        System.out.println("蓝号中了" + blueCount + "个");


        // 兑奖
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜您,中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您,中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您,中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜您,中奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1) || (redCount == 2 && blueCount == 1)) {
            System.out.println("恭喜您,中奖10元");
        } else if ((redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜您,中奖5元");
        } else {
            System.out.println("感谢您给中国福利彩票做出伟大贡献!");
        }
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }

        }
        System.out.print("]");

    }
}
