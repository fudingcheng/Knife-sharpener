package cn.itcast.array;

/**
 * 数组的遍历
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 定义一个静态数组,存放12,24,36
        // int[] ages = new int[]{12, 24, 36};
        // 简化格式
        int[] ages = {12, 24, 36, 48, 50, 66, 89};

        // 数组的遍历-循环(for)
//        for (int i = 0; i < ages.length; i++) { // i=0,1,2...
//            System.out.println(ages[i]);
//        }

        // 需求:求ages中元素的和
        /**
         * 1. 遍历:拿到每一个元素值
         * 2. 求和:把每个元素值加起来
         */
        // 定义一个变量,用来记录数组的求和
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println("数组的和是:"+sum);
    }
}
