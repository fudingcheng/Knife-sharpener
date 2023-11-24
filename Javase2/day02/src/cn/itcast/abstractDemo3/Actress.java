package cn.itcast.abstractDemo3;

/**
 * 女演员
 */
public class Actress extends Template{
    @Override
    protected void doSing() {
        System.out.println("女高音唱歌...");
    }
}
