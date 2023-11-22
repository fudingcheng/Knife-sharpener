package cn.itcast.array;

/**
 * 数组案例:求最高颜值
 */
public class ArrayDemo8 {

    public static void main(String[] args) {
        // 1. 创建一个数组记录每个人的颜值数据
        int[] faceScores = {15, 9000, 21000, 20000, 9500, -5};

        // 2.定义一个变量用来记录最高颜值的数据
        int max = faceScores[0]; // 假设第一个元素是当前的最高颜值数据

        //3. 从数组的第二个元素开始遍历,进行颜值的比较
        for (int i = 0; i < faceScores.length; i++) {
            // 4. 如果数组中的元素大于max的值
            if (faceScores[i] > max) {
                // 5. 更新max值
                max = faceScores[i];
            }
        }

        System.out.println("最高颜值是:" + max);
    }
}
