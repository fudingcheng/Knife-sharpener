package cn.itcast.arraylist;

import cn.itcast.pkg.Student;

import java.util.ArrayList;

/**
 * 集合的基本操作
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. 创建集合
        ArrayList<String> arrayList = new ArrayList<String>();

        // 2. 给集合中添加数据
        arrayList.add("a");
        System.out.println(arrayList);
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        System.out.println("-------");

        //3. 给指定位置添加元素
        arrayList.add(3,"d");
        System.out.println(arrayList);

        System.out.println("----------");

        //4. 获取指定位置的元素
        String str = arrayList.get(3);
        System.out.println(str);

        //5. 获得集合的大小
        System.out.println(arrayList.size());

        System.out.println("--------");

        //6.根据元素值移除元素
        //boolean rs = arrayList.remove("e");
        //System.out.println(rs);
        //System.out.println(arrayList);

        //7.根据元素的位置移除元素
        String str2 = arrayList.remove(0);
        System.out.println(str2);
        System.out.println(arrayList);

        System.out.println("--------");

        //8.修改指定位置上的元素
        arrayList.set(1,"B");
        System.out.println(arrayList);


    }
}
