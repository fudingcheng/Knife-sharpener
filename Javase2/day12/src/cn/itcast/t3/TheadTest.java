package cn.itcast.t3;

public class TheadTest {
    public static void main(String[] args) {
        // 创建账户对象,卡号，余额
        Account account = new Account("itheima123", 100000d);

        // 创建任务类对象，账户，取钱的金额
        GetMoneyRunnable getMoneyRunnable = new GetMoneyRunnable(account, 100000d);

        // 创建小明和小红 2条线程 // 启动2条线程
        new Thread(getMoneyRunnable,"小明").start();
        new Thread(getMoneyRunnable,"小红").start();

    }
}
