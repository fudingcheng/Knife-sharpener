package cn.itcast.conversion;

/**
 * 数据类型转换：表达式中的自动类型转换
 */
public class TypeConversion2 {

    public static void main(String[] args) {

        short s = 100;
        int i = 200;
        long l = 300;

        long ll = s + i + l;
        System.out.println(ll);

        double rs = i + l + 10.25;

        byte b = 20;
        int rs2 = s + b;

        System.out.println("-------");

        // 面试题：byte + byte = int；byte、short、char在参与运算时，会自动进行类型转换到int
        byte b1 = 1;
        byte b2 = 2;
        int b3 = b1+b2;

        System.out.println(b3);

    }
}
