package cn.itcast.t3;

public class GetMoneyRunnable implements Runnable{

    private Account account;
    private Double money;

    public GetMoneyRunnable(Account account,Double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        // 调用Account类中的getMoney（）方法
        account.getMoney(money);
    }
}
