package cn.itcast.method.homework;



/*
	分析以下需求并完成代码
		设计一个方法, 接收一个整数数组, 将数组元素按如下格式打印
		[1, 2, 3, 4, 5]
*/
public class HomeWork2 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = {1,2,3,456,5};

        System.out.print("打乱前:");
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

}
