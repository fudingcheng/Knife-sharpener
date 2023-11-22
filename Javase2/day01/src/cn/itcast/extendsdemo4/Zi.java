package cn.itcast.extendsdemo4;

import cn.itcast.extendsdemo3.Fu;

/**
 * 子类
 */
public class Zi extends Fu {


    public static void main(String[] args) {

    }

    /**
     * 保护的,可以访问
     */
    @Override
    protected void method3() {
        super.method3();
    }

    /**
     * 公共的可以访问
     */
    @Override
    public void method4() {
        super.method4();
    }
}
