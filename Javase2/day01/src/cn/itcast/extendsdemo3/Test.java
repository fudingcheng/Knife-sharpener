package cn.itcast.extendsdemo3;

/**
 * 同一个包
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();

//        fu.method1();     // 私有不能访问
        fu.method2();     // 缺省可以访问
        fu.method3();     // 受保护可以访问
        fu.method4();     // 公共可以访问
    }
}
