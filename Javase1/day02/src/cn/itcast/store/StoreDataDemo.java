package cn.itcast.store;

public class StoreDataDemo {
    public static void main(String[] args) {
        System.out.println('A'+1);

        // 想知道"?"对应的数字是多少
        System.out.println('?'+1);

        System.out.println('0'+1);

        System.out.println("十进制的："+141);    // 十进制的141
        System.out.println("----------");
        System.out.println("八进制："+0141);       // 表述八进制的141，如何书写的？
        System.out.println("----------");

        System.out.println(169);        // 十进制
        System.out.println(0x169);      // 十六进制
        System.out.println(0b100);      // 二进制

        System.out.println("-----------");

        System.out.println(0b10011001);

        int a = 5;
        int b = 2;
        System.out.println(a);  //5
        System.out.println(b);  //2
        System.out.println("---------");

        a%=b;       // 5÷2=1 a=1
        System.out.println(a);  //1
        System.out.println(b);


    }
}
