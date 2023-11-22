package cn.itcast.array;

import java.util.Scanner;

/**
 * 需求:开发一个系统,录入6个评委的打分,录入完毕后自动计算平均分
 */
public class ArrayDemo6 {

    public static void main(String[] args) {
        // 需求拆解

        // 1. 创建动态数组,目的存储评委的打分
        double[] scores = new double[6]; //6代表是有6个评委

        // 2. 评委录入分数
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        // 循环录入6个评委的打分
        // 遍历数组中的每个元素
        System.out.println("开始录入评委打分");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个评委的打分是:");
            int score = scanner.nextInt();      // 接受键盘录入的数据
            scores[i] = score;      // 将键盘录入的数据赋值给i位置的元素
        }

        // 3. 获得所有评委打分的总和
        // 定义一个变量,用户记录总分
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // 将数组中的每个元素加起来
        }

        // 4. 计算平均分; 总数/评委的个数
        double avg = sum / scores.length;

        System.out.println("评委的平均分是:" + avg);

        // 求评委打分的最大值
        // [11,34,55,67,32] 最大值
        /**
         *  思路:
         *      1. 假设第一个是最大值 max = arr[0]
         *      2. 从第二个值开始遍历数组中每个元素arr[i]
         *      3. 判断如果遍历出的arr[i] > max, 更新max的值 max = arr[i]
         */

        // 1. 假设第一个是最大值 max = arr[0]
        double max = scores[0];
        //2. 从第二个值开始遍历数组中每个元素arr[i]
        for (int i = 1; i < scores.length; i++) {
            //3. 判断如果遍历出的arr[i] > max, 更新max的值 max = arr[i]
            if (scores[i] > max) {        //找到了一个值大于max
                max = scores[i];    //用scores[i]的值替换max原来的值
            }
        }

        System.out.println("评委打分最高分是:" + max);

        // 请评委打分的最小值
        double min = scores[0]; // 假设第一个数是最小的
        // 从第二个元素开始遍历数组
        for (int i = 1; i < scores.length; i++) {
            //3. 判断如果遍历出的arr[i] < min, 更新min的值 min = arr[i]
            if (scores[i] < min) {        //找到了一个值小于min
                min = scores[i];    //用scores[i]的值替换max原来的值
            }
        }

        System.out.println("评委打分最低分是:" + min);

        // 去掉最高分和最低分的平均分: (总分 - 最高分 - 最低分) / 数组长度 - 2
        System.out.println("去掉最高分和最低分的分数是:"+(sum-max-min)/(scores.length-2));
    }

}
