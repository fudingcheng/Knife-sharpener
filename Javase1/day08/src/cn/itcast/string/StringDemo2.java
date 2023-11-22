package cn.itcast.string;

/**
 * 字符串的方法:操作字符串
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abcde";

        //1. 获取字符串的长度
        int length = s1.length();
        System.out.println(length);
        System.out.println("------");
        String s2 = new String();
        System.out.println(s2.length());

        //2. 获取字符串中指定位置的字符
        System.out.println(s1.charAt(s1.length() - 1));

        System.out.println("---------");

        //案例:遍历字符串
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.println(c);
        }

        System.out.println("------------");

        //3.把字符串转成字符数组
        char[] chars = s1.toCharArray();
        System.out.println(chars);

        System.out.println("-------");

        //4.比较字符串的内容:比较字符串,比较的字符串的内容,如果比较内容,用equals,不要用==
        String s3 = "abc";      // new String("abc")
        String s4 = "abc";      // new String("abc")
        String s5 = new String("abc");
        String s6 = new String("abc");

        System.out.println(s3 == s4);
        System.out.println(s5 == s6);

        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        System.out.println("--------");

        //5.字符串的截取subString(begin,end);  [0,1)
        String s7 = "黑马程序员";
        System.out.println(s7.substring(0, 5));  //[0,4]
        System.out.println(s7.substring(2));
        System.out.println(s7.substring(3, 3));

        //6.字符串的替换
        String s8 = "孙天祥是个好人";  //孙天祥是个**
        System.out.println(s8.replace("好人","**"));

        System.out.println("---------");

        //7.判断字符串是否是够包含某个内容
        String s9 = "孙天祥是个好人";
        System.out.println(s9.contains("天祥"));

        System.out.println("-------");

        //8.判断A字符串是否以B字符串开头
        String s10 = "孙天祥是个好人";
        System.out.println(s10.startsWith("天祥"));

        System.out.println("-----");

        //9.字符串的分割
        String nameStr = "孙天祥-高嘉豪-李芃欣";
        String[] names = nameStr.split("-");
        System.out.println(names[0]);

    }
}
