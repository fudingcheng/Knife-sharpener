package cn.itcast.arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 商品管理类:
 * 1. 商品的上架
 * 2. 商品的浏览
 */
public class ProductManage {

    Scanner scanner = new Scanner(System.in);
    // 创建商品的集合
    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * 开发程序界面
     */
    public void start() {

        // 程序一直在运行
        while (true) {
            // 给用户提示(给用户展示一个系统操作界面)
            System.out.println("======欢迎进入商品后台管理系统======");
            System.out.println("1.指令[1]添加商品");
            System.out.println("2.指令[2]浏览商品");
            System.out.println("3.指令[0]停止系统");
            System.out.println("======欢迎进入商品后台管理系统======");

            System.out.println("请输入你的指令:");
            String v = scanner.next();
            switch (v) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    printAllProducts();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("您输入的指令有误!");
            }

        }
    }

    /**
     * 商品的上架(添加)
     */
    public void addProduct() {

        System.out.println("======添加商品开始======");

        //1. 创建商品对象
        Product product = new Product();

        //2. 给对象封装数据

        // 录入菜品名称
        System.out.println("请录入商品名称:");
        String name = scanner.next();
        product.setName(name);

        // 录入原价
        System.out.println("请录入商品原价:");
        double originalPrice = scanner.nextDouble();
        product.setOriginalPrice(originalPrice);

        // 录入优惠价
        System.out.println("请录入商品优惠价:");
        double preferentialPrice = scanner.nextDouble();
        product.setPreferentialPrice(preferentialPrice);

        // 录入描述
        System.out.println("请录入商品描述:");
        String desc = scanner.next();
        product.setDesc(desc);

        //3. 将商品的对象添加到集合中
        products.add(product);

        System.out.println("======添加商品成功======");
    }

    /**
     * 商品的浏览(查询)
     */
    public void printAllProducts() {
        System.out.println("======当前上架的商品有======");
        //1. 遍历商品的集合
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            //2. 取出商品信息,打印到控制台
            System.out.println("商品名称:" + product.getName());
            System.out.println("商品原价:" + product.getOriginalPrice());
            System.out.println("商品优惠价:" + product.getPreferentialPrice());
            System.out.println("商品描述:" + product.getDesc());
            System.out.println("-----------------------------");
        }
    }

}
