package cn.itcast.array;

/**
 * 静态数组的定义
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 定义一个静态数组,存放12,24,36
        // int[] ages = new int[]{12, 24, 36};
        // 简化格式
        int[] ages = {12, 24, 36};
        System.out.println(ages);       // 存的数组的地址

        // 定义一个数组,存放学生的成绩,89.9,65.7,78.6
//        double[] scores = new double[]{89.9, 65.7, 78.6};
        // 简化格式
        double[] scores = {89.9, 65.7, 78.6};
        System.out.println(scores);   // 存的数组的地址

        // 定义一个数组,存放学生的名字,张三\李四\王五
        // String[] names = new String[]{"张三","李四","王五"};
        // 简化格式
        String[] names = {"张三", "李四", "王五"};        //建议这种方式; names是个引用数据类型. 为什么? 因为names中存的是地址
        // String names2[] = {"张三", "李四", "王五"};
        System.out.println(names);        // 存的数组的地址



        int a = 10; // 基本数据类型
    }
}
