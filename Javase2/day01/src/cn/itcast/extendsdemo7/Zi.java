package cn.itcast.extendsdemo7;


/**
 *
 */
public class Zi extends Fu {

    String name = "子类";

    @Override
    public void print() {
        String name = "局部名称";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void show() {
        print();    // 访问本类的print方法
        super.print();      // 访问父类的print方法
    }
}
