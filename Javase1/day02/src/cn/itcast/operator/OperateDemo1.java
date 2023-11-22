package cn.itcast.operator;

/**
 * 基本算数运算符
 */
public class OperateDemo1 {
    public static void main(String[] args) {
        int i = 10;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i % j);

        // 整数相除，会丢失小数位
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);

        int m = 5;
        int n = 2;
        //System.out.println(m / n * 1.0 ); //2
        System.out.println(1.0 * m / n);    //2.5

        // + 用作连接符
        int k = 5;
        System.out.println(k + "abc");        // +当做连接符使用
        System.out.println(k + "5");      // 55
        System.out.println(m + k + "abc");  //10abc;    +:能加则加，加不了在一起

    }
}
