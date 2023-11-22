package cn.itcast.method.define;

/**
 * 方法的定义
 */
public class MethodDefineDemo01 {
    public static void main(String[] args) {
        int rs = sum(10, 20);
        System.out.println(rs);

        System.out.println("-------");

        int a = 0;
        int b = 10;

        int rs2 = sum(a, b );
        System.out.println(rs2);
    }


    // 定义方法,求2个整数的和
    public static int sum(int a, int b) {
        int c = a + b;
        System.out.println("--------------");
        return c;
    }

    // 定义方法，完成3个数的加法； debug看一下程序的执行过程
}
