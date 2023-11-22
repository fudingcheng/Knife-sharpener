package cn.itcast.string;

/**
 * 字符串:面试题
 */
public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "abc";      //在常量池中创建字符串abc
        String s2 = "ab";       //在常量池中创建字符串ab
        String s3 = s2 + "c";   //变量s2 与 字符串c 进行运算,运算会在堆中开辟空间保存运算结果,s3指向的堆中常量池外的地址
        System.out.println(s1 == s3);       // false


        String s4 = "abc";      //指向的是常量池中的abc
        String s5 = "a" + "b" + "c";        //字符串a\b\c拼接, 非变量和字符串拼接, 就会在常量池中进行, 拼接的结果是abc, 此时常量池中有字符串abc,
        System.out.println(s4 == s5);       //true

    }
}
