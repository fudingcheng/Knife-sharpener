package cn.itcast.type;

/**
 * 基本数据类型：4类八种
 */
public class VariableTypeDemo {

    public static void main(String[] args) {
        // 1、整型
        byte b = 127;
        System.out.println(b);

        short s = 10;
        System.out.println(s);

        int i = 1000;
        System.out.println(i);

        short i1 = 100;


        long i2 = 1234567890123L;        // 1234567890123 字面量类型是int 1234567890123超过了int的范围，加个L就把字面量变成Long类型了


        long l = 90;

        //2、浮点型
        double v = 12.5;
        float f = 12.5f;

        //3、字符型
        char a = 'a';
        char z = '中';

        System.out.println(a);
        System.out.println(a);

        // 4、布尔类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(true);


    }

}
