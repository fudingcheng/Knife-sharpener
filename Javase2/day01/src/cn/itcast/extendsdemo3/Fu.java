package cn.itcast.extendsdemo3;

/**
 * 权限修饰符
 */
public class Fu {

    /**
     * private:私有,只能在本类中访问
     */
    private void methid1() {
        System.out.println("私有的...");
    }

    /**
     * 缺省:本类/同一个包下访问
     */
    void method2() {
        System.out.println("缺省的...");
    }

    /**
     * protected:本类/同一个包下类/子类
     */
    protected void method3() {
        System.out.println("保护的...");
    }

    /**
     * 公共类:任意包下的任意类
     */
    public void method4() {
        System.out.println("公共的...");
    }


    public void test(){
        methid1();
        method2();
        method3();
        method4();
    }

}

