package cn.itcast.enumdemo;

/**
 * 枚举的测试类
 */
public class Test {

    public static void main(String[] args) {
        A x = A.X;
        A y = A.Y;
        A z = A.Z;

        System.out.println(x);
        System.out.println(z.ordinal());    //打印枚举对象的次序
        System.out.println(A.values()[0]);
    }

}
