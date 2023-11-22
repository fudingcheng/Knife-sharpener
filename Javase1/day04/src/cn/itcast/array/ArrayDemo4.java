package cn.itcast.array;

/**
 * 数组的遍历-案例
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        // 需求:求一个部门5名员工销售额的总和   16,26,36,5,100

        // 1. 定义一个数组,存5名员工的销售额
        int[] money = {16, 26, 36, 5, 100};

        // 定义一个变量,记录数组元素的求和
        int sum = 0;

        //2. 遍历数组
        for (int i = 0; i < money.length; i++) {
            //3. 求和
            sum += money[i];
        }

        System.out.println("5名员工的销售总额是:" + sum);
    }
}
