package cn.itcast.method.parameter;

/**
 * 引用类型数据的传递：打印int类型数组的内容
 */
public class MethodParameterDemo3 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {1, 2, 5, 6, 2, 2, 4, 3, 4, 5};
        System.out.println(arr);
        //打印效果：{1,2,3,4,5}
        System.out.println("------");
        //调用方法
        printArray(arr);        // arr传递的就是数组在内存中的地址值
    }

    /**
     * 定义一个方法，打印int类型数组，效果{1,2,3,4,5}
     * 1、需不需要参数：需要，传递的数据类型是一个int数组类型数据
     * 2、需不需要返回值：不需要
     * 3、方法体实现
     */
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { //最后一个
                System.out.print(arr[i]);
            } else { //不是最后一个
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("}");
    }

}

