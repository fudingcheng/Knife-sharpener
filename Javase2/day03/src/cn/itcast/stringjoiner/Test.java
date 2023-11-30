package cn.itcast.stringjoiner;

import java.util.StringJoiner;

/**
 * StringJoiner
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 参数一:拼接分隔符
         * 参数二:开始字符
         * 参数三:结束字符
         */
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");

        for (int i = 0; i < 1000000; i++) {
            stringJoiner.add("abc");
        }

        System.out.println(stringJoiner);
    }

}
