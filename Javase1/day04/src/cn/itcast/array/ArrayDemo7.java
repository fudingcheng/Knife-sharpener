package cn.itcast.array;

import java.util.Scanner;

/**
 * 数组:2个变量指向同一个数组
 */
public class ArrayDemo7 {

    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("修改前,arr1[0]的位置值是:" + arr1[0]);
        // 引用数据类型的特点, 当数据发生变更后, 所有指向同一个地址的数据都会发生改变
        arr1[0] = 99;
        System.out.println("修改后,arr1[0]的位置值是:"+arr1[0]);
        System.out.println("修改前,arr2[0]的位置值是:"+arr2[0]);

        System.out.println("-----------");

        // 把arr2赋值为null
        arr2 = null;
        System.out.println(arr2);
        System.out.println(arr2[0]);
    }
}
