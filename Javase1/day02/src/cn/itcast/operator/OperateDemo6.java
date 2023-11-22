package cn.itcast.operator;

/**
 * 三元运算符
 */
public class OperateDemo6 {
    public static void main(String[] args) {
        // 尝尽1：根据学生的考试成绩，如果成绩>=60 打印结果：及格；否则（<=60）就是不及格。

        // 声明变量，记录下学生的成绩
        double score = 58;
        // 三元运算符 比较
        String rs = score >= 60 ? "及格" : "不及格";
        System.out.println(rs);


        // 场景2：比较2个数的大小，返回大的数
        int a = 2;
        int b = 5;

        int rs2 = a > b ? a : b;
        System.out.println(rs2);

        // 场景3：比较3个数的大小，返回大的
        int x = 11130;
        int y = 9452;
        int z = 7222;

        /**
         * 思路：
         * 1、先比较其中的2个数，拿到结果
         * 2、再和第三个数比较
         */
        int temp = x > y ? x : y;   // 1、先比较其中的2个数，拿到结果
        int rs3 = temp > z ? temp : z;
        System.out.println(rs3);


        // 优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); //true
        System.out.println((10 > 3 || 10 < 3) && 10 < 3); //false


    }
}
