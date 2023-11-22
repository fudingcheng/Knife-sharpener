package cn.itcast.conversion;

/**
 * 数据类型转换：自动转换
 */
public class TypeConversion {

    public static void main(String[] args) {

        // 场景：将小类型的变量，交给大类型接受，java就会进行小 → 大的自动转换，不需要程序员做额外的操作
        byte b = 100;       // 声明了byte类型的变量
        short s = 200;

        int i = b;      // 自动类型转换
        int j = s;


        // int → double
        int m = 100;
        double d = m;
        System.out.println(d);

        // int → float
        float f = m;
        System.out.println(f);

        // char → int
        char a = '!';
        int i1 = a;
        System.out.println(i1);
    }
}
