package cn.itcast.t5;

public class TheadTest {
    public static void main(String[] args) {
        // 创建账户对象,卡号，余额
        Account account = new Account("itheima123", 100000d);

        // 创建任务类对象，账户，取钱的金额
        GetMoneyRunnable getMoneyRunnable = new GetMoneyRunnable(account, 100000d);

        // 创建 小明和小红 2条线程 // 启动2条线程
        new Thread(getMoneyRunnable,"小红").start();
        new Thread(getMoneyRunnable,"小明").start();

        /*// 模拟郝陈杰和王子豪取钱
        Account account1 = new Account("itheima123", 1000000d);

        // 创建任务类对象，账户，取钱的金额
        GetMoneyRunnable getMoneyRunnable2 = new GetMoneyRunnable(account1, 1000000d);

        // 开始取钱
        new Thread(getMoneyRunnable2,"郝陈杰").start();
        new Thread(getMoneyRunnable2,"王子豪").start();*/



    }
}
