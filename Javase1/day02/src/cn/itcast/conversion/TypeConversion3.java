package cn.itcast.conversion;

/**
 * 数据类型转换：强制类型转换
 */
public class TypeConversion3 {

    public static void main(String[] args) {

        int i = 128;
        short s = (short) i;       // 强制类型转换
        System.out.println(s);

        byte b = (byte) i;
        System.out.println(b);

        // 小数 转 整数
        double d = 9.5;
        int j = (int) d;
        System.out.println(j);

        System.out.println("-------");

        int k = 1500;
        System.out.println(k);
        byte b2 = (byte) k;
        System.out.println(b2);


    }
}
