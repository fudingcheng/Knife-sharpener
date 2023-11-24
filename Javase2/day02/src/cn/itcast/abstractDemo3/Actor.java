package cn.itcast.abstractDemo3;

/**
 * 男演员
 */
public class Actor extends Template{
    @Override
    protected void doSing() {
        System.out.println("男低音唱歌...");
    }
}
