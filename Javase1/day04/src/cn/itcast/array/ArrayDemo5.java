package cn.itcast.array;

/**
 * 动态数组的初始化
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        // 创建具有5个元素的int类型数组
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        arr[0] = 10;   // 将0号索引位置改为10;
        System.out.println(arr[0]);

        System.out.println(arr[2]);     //0
        arr[2] = 20;
        System.out.println(arr[2]);     //20
        arr[3] = 50;                    // arr[3] 访问的是第4个元素,但是当前第4个元素不存在,如果赋值会发生什么?


         // 注意:数组定义的时候, 静态数组和动态数组的格式不能混用
         // 非法: int[] arr5 = new int[2]{1,2};
        int[] arr5 = new int[]{1,2};
        System.out.println("---------");

        // 创建长度为3的字符数组
        char[] arr2 = new char[3];
        System.out.println((int) arr2[0]);

        System.out.println("--------");

        // 创建长度为5的字符串数组
        String[] arr3 = new String[5];
        System.out.println(arr3);
        System.out.println(arr3[0]);

        System.out.println("------");

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int[] arr4 = {0, 0, 0, 0, 0};
//        for (int i = 0; i < arr4.length; i++) {
//            System.out.print(arr4[i]+" ");
//        }
    }
}
