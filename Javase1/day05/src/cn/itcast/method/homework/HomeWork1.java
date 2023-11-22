package cn.itcast.method.homework;

import java.util.Random;

/*
	分析以下需求并完成代码
		设计一个方法, 接收一个整数数组, 完成数组元素打乱
*/
public class HomeWork1 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1,2,3,4,5};

        System.out.print("打乱前:");
        printArr(arr);

        // 打乱数组
        randomArray(arr);
        System.out.println();

        System.out.print("打乱后:");
        printArr(arr);

    }

    /**
     * 打印数组
     * @param arr
     */
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }

    /**
     * 需求:打乱数组
     * 需不需要参数:数组-int[]
     * 需不需要返回值:不需要
     */

    public static void randomArray(int[] arr) {

        Random random = new Random();

        //1. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            //2. 生成数组中任意的位置
            int randomIndex = random.nextInt(arr.length - 1);
            //3. 将arr[i] 与 任意位置的元素 进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }



}
