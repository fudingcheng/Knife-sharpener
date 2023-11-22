package cn.itcast;

import java.util.Scanner;

/**
 * 评委打分
 */
public class Case3 {

    public static void main(String[] args) {

        double score = evaluate(5);
        System.out.println("当前的平均分是:" + score);

    }

    //评委打分
    private static double evaluate(int n) {

        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[n];
        System.out.println("请开始录入分数");
        //1. 存储下各个评委的分数
        /*for (int i = 0; i < n; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分:");
            while (true) {
                int score = scanner.nextInt();
                //判断分数是否在[0-100]之间
                if (score >= 0 && score <= 100) {       //合法
                    scores[i] = score;
                    //结束循环
                    break;
                } else {  //非法
                    System.out.println("录入数据有误,请录入0-100之间的数");
                }
            }
        }*/

        for (int i = 0; i < n; i++) {
            System.out.println("请第" + (i + 1) + "个评委打分:");
            int score = scanner.nextInt();
            //判断分数是否在[0-100]之间
            if (score >= 0 && score <= 100) {       //合法
                scores[i] = score;
            } else {  //非法
                System.out.println("录入数据有误,请录入0-100之间的数");
                i--;
            }
        }

        // printArr(scores);

        //2. 找到最高分\最低分,算出总分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }

            sum += scores[i];

        }

        //3. 计算平均分

        return (sum - max - min) / (scores.length - 2);

    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
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

