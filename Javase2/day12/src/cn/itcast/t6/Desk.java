package cn.itcast.t6;

import java.util.ArrayList;

/**
 * 桌子类
 */
public class Desk {

    private ArrayList list = new ArrayList();

    /**
     * 放包子
     */
    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0) {
                // 当前没有包子
                System.out.println(name + "生产一个包子");
                list.add(name + "生产一个包子");

                Thread.sleep(2000);

                // 唤醒其他线程
                this.notifyAll();
                // 自己等待
                this.wait();
            } else {
                // 有包子

                // 唤醒其他线程
                this.notifyAll();
                // 自己等待
                this.wait();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 吃包子
     */
    public synchronized void get() {
        String name = Thread.currentThread().getName();
        try {
            if (list.size() == 1) {
                // 有一个包子
                System.err.println(name + "吃了" + list.get(0));
                list.clear();

                Thread.sleep(2000);

                this.notifyAll();
                this.wait();
            } else {
                // 没有包子
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
