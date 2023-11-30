package cn.itcast.stringbuffer;

/**
 * StringBuffer
 */
public class Test1 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        // 字符串拼接
        stringBuffer.append("abc");
        stringBuffer.append(123);
        stringBuffer.append(true);
        System.out.println(stringBuffer.toString());

        System.out.println("------------");

        // 链式编程
        stringBuffer.append("ABC").append("中国");
        System.out.println(stringBuffer);
        System.out.println("--------");

        // 字符串反转
        System.out.println(stringBuffer.reverse());

        System.out.println("-----------");

        // 字符串长度
        System.out.println(stringBuffer.length());

        System.out.println("----------------");

        // StringBuffer转String对象
        System.out.println(stringBuffer.toString());
    }
}
