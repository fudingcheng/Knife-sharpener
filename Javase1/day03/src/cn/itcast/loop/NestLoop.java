package cn.itcast.loop;

/**
 * 循环嵌套
 */
public class NestLoop {
    public static void main(String[] args) {
        // 需求: 你犯错了, 让你每天说5遍我爱你,连续说3天

        // 外层循环控制连续3天,执行3次循环
        for (int i = 0; i < 3; i++) {
            // 内存循环,控制每天说5遍 我爱你
            for (int j = 0; j <5 ; j++) {
                System.out.println("我爱你");
            }
        }


        // 需求2:在控制台打印4行5列的矩形*
        /**
         *          *****
         *          *****
         *          *****
         *          *****
         */
        // 外层循环控制多少行;4行
        for (int i = 0; i < 4; i++) {
            // 内层控制每行有多少个(列)*;5个
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");          // 打印的内存在一行
            }
            // 换行
            System.out.println();   // 换行
        }
    }
}
