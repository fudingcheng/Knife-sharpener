package cn.itcast.finalDemo;

/**
 * final关键字
 */
public class FinalDemo1 {

    public static void main(String[] args) {
        // final修饰变量:基本类型
        final int a = 10;
        //a = 20;
        change(a);
        System.out.println(a);

        System.out.println("-----------");

        // final修饰变量:引用变量
        final int[] arr = {11, 22, 33};
        //arr = new int[]{10, 20, 30};
        System.out.println(arr[1]);
        arr[1] = 100;
        System.out.println(arr[1]);


        A a1 = new A();
        a1.show();
        a1.show2();

    }

    static void change(int a) {
        a = 10;
    }

}

// final修饰类,就不可以被继承了
final class A {

    // final修饰方法,子类不能重写
    final public void show() {

    }

    public void show2() {

    }
}

//class B extends A{
////    @Override
////    public void show() {
////        super.show();
////    }
//
//    @Override
//    public void show2() {
//        super.show2();
//    }
//}