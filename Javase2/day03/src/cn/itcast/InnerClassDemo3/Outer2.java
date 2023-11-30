package cn.itcast.InnerClassDemo3;

interface Swimming {
    void swim();
}

/**
 * 匿名内部类的应用场景
 */
public class Outer2 {


    public static void main(String[] args) {
        // 调用go方法,方法的形参是接口,实参就要是接口的实现类对象
//        Swimming swimming = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        };
//        go(swimming);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });
    }

    public static void go(Swimming swimming) {
        swimming.swim();
    }
}