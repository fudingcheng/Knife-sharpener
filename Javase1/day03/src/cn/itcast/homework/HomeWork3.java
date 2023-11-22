package cn.itcast.homework;

/*
	分析以下需求并完成代码
		按照从大到小的顺序, 输出四位数中个位+百位=十位+千位的数字,
    	每行输出7个满足条件的数, 之间用空格分隔
*/
public class HomeWork3 {
    public static void main(String[] args) {
        // 拆分

        // 从大到小的顺序,所有的四位数,1000-9999
        // 定义一个变量,统计满足条件的个数
        int count = 0;
        for (int i = 9999; i >= 1000; i--) {
            //四位数中个位+百位=十位+千位的数字
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            if (ge + bai == shi + qian) {
                count++;        // 1. 统计个数
                System.out.print(i + " ");    //2. 打印数字
                if (count % 7 == 0) {      //3. 每打到7个数字后,换行
                    System.out.println();
                }
            }
        }
    }
}
