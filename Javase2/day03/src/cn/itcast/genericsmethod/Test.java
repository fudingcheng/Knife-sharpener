package cn.itcast.genericsmethod;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

/**
 * 泛型方法
 */
public class Test {
    public static void main(String[] args) {
        String s = test("abc");
        Car test = test(new Car());

        System.out.println("-----------");

        ArrayList<Car> list1 = new ArrayList<Car>();
        list1.add(new Car());
        list1.add(new Car());
        list1.add(new Car());

        go(list1);

        System.out.println("----------");

        ArrayList<BMW> list2 = new ArrayList<BMW>();
        list2.add(new BMW());
        list2.add(new BMW());
        list2.add(new BMW());

        go(list1);

        System.out.println("----------");

        ArrayList<BENZ> list3 = new ArrayList<BENZ>();
        list3.add(new BENZ());
        list3.add(new BENZ());
        list3.add(new BENZ());

        go(list1);

    }


    public static <T extends Car> void go(ArrayList<T> cars) {

    }

    /**
     * 泛型方法,定义一个方法,参数类型和返回值一样
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T test(T t) {
        return t;
    }
}
