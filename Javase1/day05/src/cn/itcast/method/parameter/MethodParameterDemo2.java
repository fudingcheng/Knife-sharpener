package cn.itcast.method.parameter;

/**
 * 方法参数的传递：引用类型——值传递
 */
public class MethodParameterDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30};
        change(arr);    // 值传递；arr的值是什么，数组在堆内存中的地址
        System.out.println("-----------");
        System.out.println(arr[1]); //222
    }


    public static void change(int[] arr) {
        System.out.println(arr[1]); //20
        arr[1] = 222;
        System.out.println(arr[1]); //222
    }
}

