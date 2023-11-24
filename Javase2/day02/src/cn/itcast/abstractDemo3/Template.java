package cn.itcast.abstractDemo3;

/**
 * 抽象类应用场景:模板设计模式
 */
public abstract class Template {

    /**
     * 模板方法不能被重写
     */
    public final void sing() {
        System.out.println("唱一首你喜欢的歌");

        doSing();

        System.out.println("唱完了!");
    }

    protected abstract void doSing();

}
