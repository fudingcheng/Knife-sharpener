package cn.itcast.arraylistdemo;

/**
 * 商品的实体类
 */
public class Product {
    private String name;        //名称
    private double originalPrice;      //原价
    private double preferentialPrice;   //优惠价格
    private String desc;        //商品描述

    public Product() {
    }

    public Product(String name, double originalPrice, double preferentialPrice, String desc) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.preferentialPrice = preferentialPrice;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getPreferentialPrice() {
        return preferentialPrice;
    }

    public void setPreferentialPrice(double preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
