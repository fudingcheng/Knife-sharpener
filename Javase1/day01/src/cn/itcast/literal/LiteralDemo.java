package cn.itcast.literal;

/**
 * 字面量
 */
public class LiteralDemo {
    public static void main(String[] args) {
        // 1、整数、小数
        System.out.println(88);
        System.out.println(10.2);

        System.out.println("---------------");

        //2、字符
        System.out.println('a');
        System.out.println('中');
        System.out.println('0');
        //System.out.println(' ');    //字符不能为空，这是一个空格字符
        System.out.print('\n');   //特殊字符\n 代表换一行
        System.out.println('国');
        System.out.println('\t');   //特殊字符 \t 代表tab

        System.out.println("————————————————————————————————————");

        //3、字符串
        System.out.println("黑马程序员");
        System.out.println("123456");
        System.out.println("abc");
        System.out.println("                 ");
        System.out.println("黑马 abc  123");

        //4、布尔
        System.out.println(true);   //布尔值true
        System.out.println("true"); //字符串true
        System.out.println(false);

    }
}
