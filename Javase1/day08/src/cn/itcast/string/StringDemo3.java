package cn.itcast.string;

/**
 * 字符串内容不可变
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String name = "黑马";
        System.out.println(name);       //黑马

        System.out.println("---------");

        name +="程序员";
        System.out.println(name);       //黑马程序员

        System.out.println("-------");

        name+="播妞";
        System.out.println(name);       //黑马程序员播妞

        /**
         * 字符串内容不可变:
         *  1. 字符串字面量是不变的,并不是说字符串变量指向不变
         *  2. 每一次"..."创建的字符串, 字符串存在于字符串常量池中
         *  3. 每次对字符串进行拼接的时候, Java会开辟新的空间来操作, 原字符串的内容是不变的
         */


    }
}
