package cn.itcast.api;

import java.util.ArrayList;

/**
 * 包装类的使用
 */
public class Test {

    public static void main(String[] args) {
        int v = 10;

        // 自动装箱
        Integer integer = v;

        // 自动插箱
        int v2 = integer;

        // 集合中只能使用包装类
        ArrayList<Integer> list = new ArrayList<>();

        // 字符串转数字
        String str = "123";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));

        // 数字转字符串
        System.out.println(integer.toString());
        System.out.println(integer + "");
    }

}
