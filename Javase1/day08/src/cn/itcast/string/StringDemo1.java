package cn.itcast.string;

/**
 * 创建字符串
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //方式一: 通过""创建字符串
        String s1 = "abc";
        System.out.println(s1);
        String s4 = "";
        System.out.println(s4);

        System.out.println("--------");

        //方式二:通过构造器创建
        String s2 = new String("abc");
        System.out.println(s2);
        String s3 = new String();
        System.out.println(s3);

        char[] chars = {'a', 'b', 'c'};
        String s5 = new String(chars);
        System.out.println(s5);

        byte[] bytes = {97, 98, 99};
        String s6 = new String(bytes);
        System.out.println(s6);

    }
}
