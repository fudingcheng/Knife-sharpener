package cn.itcast.array;

/**
 * 数组案例:数据元素的交换
 */
public class ArrayDemo9 {

    public static void main(String[] args) {
        // 定义一个数据10,20,30,40,50
        int[] arr = {11, 32, 344, 23, 78};
        System.out.print("交换前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 交换数组中的元素
        /** i~j
         * 0 ~ arr.length-1 交换
         * 1 ~ arr.length-2 交换
         * 2 ~ arr.length-3 交换
         * ....
         * 何时停止交换? i < j 进行交换;否则不交换
         */
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //完成数据的交换
            int temp; //临时变量
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("交换后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("--------");
        int a = '2';        //正确的。 为什么可以把字符类型的字面量给int类型的变量；底层将字符'a'转换为数字存储
        System.out.println(a);  // 50

        int[] arr2 = {'2', 3, 4};
    }
}
