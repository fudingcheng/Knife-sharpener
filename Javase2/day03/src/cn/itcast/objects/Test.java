package cn.itcast.objects;

import java.util.Objects;

/**
 * 测试Objects工具类
 */
public class Test {

    public static void main(String[] args) {
        String name1= "abc";
        String name2 = null;

        System.out.println(Objects.equals(name1, name2));
        System.out.println(Objects.nonNull(name2));
        System.out.println(Objects.isNull(name1));

    }

}
