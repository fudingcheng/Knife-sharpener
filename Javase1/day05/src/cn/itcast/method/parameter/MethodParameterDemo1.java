package cn.itcast.method.parameter;

/**
 * 方法参数的传递：基本类型——值传递
 */
public class MethodParameterDemo1 {
    public static void main(String[] args) {
        int a = 10;
        change(a); // 调用方法，值传递 a = 10  ;change(10)
        System.out.println("--------");
        System.out.println(a);  //a = 10;
    }


    public static void change(int num){
        System.out.println(num); // num =10
        num = 20;
        System.out.println(num);  // num =20
    }
}

