package cn.itcast.generics;

import java.util.ArrayList;

/**
 * 泛型的作用
 */
public class Test {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add(new Cat());        // 不同类型的数据也可以添加

//        for (int i = 0; i < list.size(); i++) {
//            String name = (String) list.get(i);
//            System.out.println(name);
//        }

        System.out.println("----------");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        list2.add("赵六");
        //list2.add(new Cat());        // 设置泛型后,不同类型的数据就不可以添加

        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            System.out.println(s);
        }

    }

}

class Cat {

}


