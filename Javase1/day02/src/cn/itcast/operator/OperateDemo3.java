package cn.itcast.operator;

/**
 * 赋值运算符
 */
public class OperateDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a += b); // 30
        /**
         * 相当于做了2件事：
         *  一、a = a +b；
         *  二、System.out.println(a)
         */
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

        System.out.println("--------");
        byte b1 = 10;
        byte b2 = 20;
        byte rs = (byte) (b1 + b2);      //编译报错，因为byte类型的变量参与运算时，会自动转换为int
        b1 += b2;   // 编译没报错；说明：+=底层做了强制类型转换
        System.out.println(b1);

        // / %
        /*
            /: 除法
            %：取余（模运算）
         */
        System.out.println("===========");
        int i = 5;
        int j = 2;

        System.out.println(i / j);    // 5 ➗ 2 = 2
        System.out.println(j / i);    // 2 ➗ 5 = 0

        System.out.println(i % j);     // 5 ÷ 2 商2余数 1
        System.out.println(j % i);     // 2 ÷ 5 商0余数 2


    }
}
