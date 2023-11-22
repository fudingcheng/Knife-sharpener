package cn.itcast.string;

/**
 * 字符串创建: "" 和 new 方法的不同
 */
public class StringDemo4 {
    public static void main(String[] args) {
        /**
         * "..."创建的字符串,在常量池中,相同的内容,只保存一份
         */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //true;   比较字符串在内存中的地址;   s1和s2都指向的是同一个地址

        /**
         * new String("...")创建的字符串, 每次在堆中都会产生一个新的对象,所以地址是不同的
         */
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4); //false;  比较字符串在内存中的地址;   s3和s4指向的不是同一个地址
        
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));
    }
}
