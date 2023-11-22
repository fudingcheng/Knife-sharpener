package cn.itcast.method.homework;

/*
	分析以下需求并完成代码
		设计一个方法, 接收一个整数数组, 同时返回该数组的最大值和最小值
*/
public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 90, 5, 6};
        String rs = getMaxAndMin(arr);
        System.out.println(rs);
    }

    public static String getMaxAndMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        //1. 遍历数组
        for (int i = 0; i < arr.length; i++) {
            //找最大值
            if (arr[i] > max) {
                max = arr[i];
            }
            // 最小值
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //String result = "数组中的最大值是:" + max + ", 最小值是:" + min;
        //return result;
        return  "数组中的最大值是:" + max + ", 最小值是:" + min;
    }
}
