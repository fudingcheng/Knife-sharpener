package cn.itcast.t5;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 */
public class Account {

    private String cardId;  //卡号
    private Double money;   //余额

    public Account() {
    }

    public Account(String cardId, Double money) {
        this.cardId = cardId;
        this.money = money;
    }

    private final ReentrantLock lock = new ReentrantLock();

    // 取钱的方法
    public void getMoney(Double money) {

        // 获取name，以便直到当前是哪个人在取钱
        String name = Thread.currentThread().getName();
        // 加锁
        //lock.lock();

        if (this.money >= money) {

            System.out.println(name + "可以取钱");
            this.money -= money;
            System.out.println(name + "取钱完毕，余额是：" + this.money);
        } else {
            System.out.println(name + "取钱失败，余额不足");
        }

        // 释放锁
        //lock.unlock();
    }

}
