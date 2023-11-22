package cn.itcast.homework;

/*
	分析以下需求并完成代码
    	打印[1-1000]之间的整数, 数字中包含7或者是7倍数的数字要跳过
    	要求控制台每行打印5个满足条件的数, 之间用空格分隔
*/
public class Homework2 {
    public static void main(String[] args) {
        // 拆解需求

        // 1. 查找[1-1000]之间的整数
        // 定义一个变量,用来记录打印数的个数
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            int ge = i % 10;             // 个位上的数字
            int shi = i / 10 % 10;       // 十位上的数字
            int bai = i / 100 % 10;      // 百位上的数字
            // 数字中包含7或者是7的倍数跳过
            if (ge != 7 && shi != 7 && bai != 7 && i % 7 != 0) {         // i ➗ 7 能除尽(没有余数)就代表当前的数是7的倍数
                count++;                    // 统计满足条件的数
                System.out.print(i + " ");  // 打印数字
                if (count % 5 == 0) {     // 每5个换行
                    System.out.println();   //换行
                }
            }
        }
    }
}
