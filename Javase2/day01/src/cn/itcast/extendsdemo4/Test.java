package cn.itcast.extendsdemo4;

import cn.itcast.extendsdemo3.Fu;

/**
 * 不能包下的类
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();

        //  fu.method1();     // 私有不能访问
        //  fu.method2();     // 缺省不能访问
        //  fu.method3();     // 受保护不能访问
        fu.method4();     // 公共可以访问
    }
}
