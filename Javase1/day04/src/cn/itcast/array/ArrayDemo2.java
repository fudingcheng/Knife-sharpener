package cn.itcast.array;

/**
 * 数组的访问
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 定义一个静态数组,存放12,24,36
        // int[] ages = new int[]{12, 24, 36};
        // 简化格式
        int[] ages = {12, 24, 36, 48, 50, 66, 89};
        System.out.println(ages);       // 存的数组的地址
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        // System.out.println(ages[3]);    // 报错;不能访问,访问数组越界了

        System.out.println("-----------");

        // 定义一个数组,存放学生的成绩,89.9,65.7,78.6
//        double[] scores = new double[]{89.9, 65.7, 78.6};
        // 简化格式
        double[] scores = {89.9, 65.7, 78.6};
        System.out.println(scores);   // 存的数组的地址
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        System.out.println("--------");

        // 定义一个数组,存放学生的名字,张三\李四\王五
        // String[] names = new String[]{"张三","李四","王五"};
        // 简化格式
        String[] names = {"张三", "李四", "王五"};        //建议这种方式; names是个引用数据类型. 为什么? 因为names中存的是地址
        // String names2[] = {"张三", "李四", "王五"};
        System.out.println(names);        // 存的数组的地址
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        System.out.println("-------");

        //数组的长度
        System.out.println("ages这个数组的长度:" + ages.length);

        // 数组当中的最大元素的索引如何表示?
        System.out.println("age的最大索引是:" + (ages.length - 1));

    }
}
