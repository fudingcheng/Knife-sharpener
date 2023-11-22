package cn.itcast.arraylist;

import java.util.ArrayList;

/**
 * 集合的删除操作
 */
public class ArrayListCase1 {
    public static void main(String[] args) {
        //1. 创建集合
        ArrayList<String> arrayList = new ArrayList<>();

        //2. 把数据添加到集合中
        arrayList.add("Java入门");
        arrayList.add("宁夏枸杞");
        arrayList.add("黑枸杞");
        arrayList.add("人字拖");
        arrayList.add("特级枸杞");
        arrayList.add("枸杞子");

        System.out.println("删除前:" + arrayList);

        //3. 不买枸杞了,把所有枸杞相关的商品都删除

        // 遍历集合
//        for (int i = 0; i < arrayList.size(); i++) {
//            // 取出每个商品
//            String product = arrayList.get(i);
//            //判断遍历的每一个商品是否和枸杞相关
//            if(product.contains("枸杞")){
//                //把当前的商品从集合中删除
//                arrayList.remove(product);
//            }
//        }

        //方案一:每次删除完毕后,对i--
//        for (int i = 0; i < arrayList.size(); i++) {
//            // 取出每个商品
//            String product = arrayList.get(i);
//            //判断遍历的每一个商品是否和枸杞相关
//            if(product.contains("枸杞")){
//                //把当前的商品从集合中删除
//                arrayList.remove(product);
//                i--;
//            }
//        }

        //方案二:倒着遍历
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            // 取出每个商品
            String product = arrayList.get(i);
            //判断遍历的每一个商品是否和枸杞相关
            if (product.contains("枸杞")) {
                //把当前的商品从集合中删除
                arrayList.remove(product);
            }
        }




        System.out.println("删除后:" + arrayList);

    }
}
