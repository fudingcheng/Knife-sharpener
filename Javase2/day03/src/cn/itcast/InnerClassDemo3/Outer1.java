package cn.itcast.InnerClassDemo3;

/**
 * 匿名内部类:特殊的局部内部列
 */
public class Outer1 {

    public static void main(String[] args) {
        //Animal animal = new Cat();

        Animal animal = new Animal() {
            @Override
            public void cry() {
                System.out.println("小猫喵喵叫2");
            }
        };

        animal.cry();
    }
}


/**
 * 要使用Animal类,创建Animal的子类
 */
//class Cat extends Animal {
//
//    @Override
//    public void cry() {
//        System.out.println("小猫喵喵叫");
//    }
//}

abstract class Animal {
    public abstract void cry();
}
