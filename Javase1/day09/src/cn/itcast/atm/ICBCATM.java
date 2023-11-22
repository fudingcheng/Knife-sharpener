package cn.itcast.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * atm类
 */
public class ICBCATM {

    // 创建键盘录入对象, 接受用户录入的指令
    Scanner scanner = new Scanner(System.in);
    // 当前登录账户
    ICBCAccount loginAccount;
    // 创建一个集合,用来存储atm系统的所有账户
    private ArrayList<ICBCAccount> accounts = new ArrayList<ICBCAccount>();

    /**
     * atm启动方法,展示系统界面
     */
    public void start() {

        while (true) {
            // 展示系统欢迎界面
            System.out.println("======欢迎进入ICBC-ATM系统======");
            System.out.println("1. 指令【1】代表用户登录");
            System.out.println("2. 指令【2】代表用户开户");
            System.out.println("======欢迎进入ICBC-ATM系统======");


            System.out.println("请输入您要操作的指令:");
            String v = scanner.next();

            // 判断指令
            switch (v) {
                case "1":
                    login();
                    break;
                case "2":
                    //开户操作
                    createAccount();
                    break;
                default:
                    System.out.println("您输入的指令有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 用户登录
     */
    private void login() {
        System.out.println("======用户登录操作======");
        //1. 判断下集合中是否有账户
        if (accounts.size() == 0) {    // 系统中没有账户
            System.out.println("当前系统中没有账户,请先开户再来登录!");
            return; //跳出方法
        }

        while (true) {
            //2. 输入卡号
            System.out.println("请输入您的卡号:");
            String cardId = scanner.next();

            //3. 判断卡号是否合法,是否满足8位
            if (cardId.length() != 8) {  //不合法
                System.out.println("您输入的卡号不合法,请重新输入!");
            } else {
                //4. 判断卡号是否正确
                // 通过卡号查询账户对象
                loginAccount = findAccountByCardId(cardId);
                if (loginAccount == null) {    // 卡号输入不正确,没有查到对应的账户
                    System.out.println("您输入的卡号不正确,请确认后重新输入!");
                } else {        //卡号输入不正确,查询出一个账户
                    while (true) {
                        //5. 输入密码
                        System.out.println("请输入您的密码:");
                        String password = scanner.next();
                        //6. 判断密码是否正确
                        if (password.equals(loginAccount.getPassword())) { //密码正确
                            System.out.println("恭喜您:" + loginAccount.getUsername() + ",登录成功,您的卡号是【" + loginAccount.getCardId() + "】,您的余额是【" + loginAccount.getMoney() + "】");

                            //用户操作页
                            showUserCommand();
                            return;
                        } else {        //密码输入有误
                            System.out.println("您的密码输入有误,请重新输入!");
                        }
                    }
                }
            }
        }

    }

    /**
     * 显示用户操作页
     */
    private void showUserCommand() {
        System.out.println("======您可以办理如下业务======");
        while (true) {
            // 给用户提示操作账户相关的指令
            System.out.println("1. 指令【1】代表查询账户");
            System.out.println("2. 指令【2】代表存款");
            System.out.println("3. 指令【3】代表取款");
            System.out.println("4. 指令【4】代表转账");
            System.out.println("5. 指令【5】代表修改密码");
            System.out.println("6. 指令【6】代表退出");
            System.out.println("7. 指令【7】代表注销账户");

            // 接受用户输入的指令
            System.out.println("请输入您要操作的指令:");
            String v = scanner.next();
            switch (v) {
                case "1":       //查询账户
                    showUserInfo();
                    break;
                case "2":       //存款
                    saveMoney();
                    break;
                case "3":       //取款
                    drawMoney();
                    break;
                case "4":       //转账
                    transferMoney();
                    break;
                case "5":       //修改密码
                    boolean rs = updatePassword();
                    if (rs) { //修改成功
                        return;     //结束用户登录的方法,让用户重新登录
                    }
                    break;
                case "6":       //退出
                    System.out.println("欢迎下次再来!");
                    return;
                case "7":       //注销账户
                    boolean rs2 = deleteAccount();
                    if (rs2) {
                        return; // 退出登录
                    } else {
                        break;
                    }
                default:
                    System.out.println("您输入的指令有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 注销账户
     */
    private boolean deleteAccount() {
        System.out.println("======注销账户======");

        //1. 确认是否真的注销
        System.out.println("您是否想好了,确认要注销账户,确认注销请输入:n");
        String msg = scanner.next();

        //2.判断用户输入的值
        switch (msg) {
            case "n":
                // 开始注销
                System.out.println("注销进行中...");

                while (true) {
                    // 3. 提示用户输入账户密码,确认安全
                    System.out.println("请输入账户密码:");
                    String password = scanner.next();
                    //4. 判断密码是否正确
                    if (loginAccount.getPassword().equals(password)) {
                        //5. 判断账户中是否有余额
                        if (loginAccount.getMoney() > 0) {       // 有余额
                            System.out.println("账户中还有余额,不能注销!");
                            return false; //跳出方法
                        } else {      //账户中没有余额,可以注销
                            //6. 在集合中删除当前登录的账户
                            accounts.remove(loginAccount);
                            System.out.println("注销成功,拜拜啦~~~");
                            return true; //跳出方法
                        }
                    } else {
                        System.out.println("密码输入有误,不能注销,请确认后再次输入密码!");
                    }
                }

            default:
                System.out.println("账户成功保留!");
                break;
        }
        return false;
    }

    /**
     * 修改密码
     */
    private boolean updatePassword() {
        System.out.println("======修改密码======");

        while (true) {
            //1. 输入当前密码,确认安全
            System.out.println("请输入当前的密码:");
            String oldPassword = scanner.next();

            //2. 判断旧密码是否正确
            if (loginAccount.getPassword().equals(oldPassword)) {     //可以修改
                while (true) {
                    // 3. 输入新密码
                    System.out.println("请输入新的密码:");
                    String newPassword = scanner.next();

                    // 4. 确认新密码
                    System.out.println("请您确认密码:");
                    String newRepeatPassword = scanner.next();

                    //5. 判断2次密码是否一致
                    if (newPassword.equals(newRepeatPassword)) {
                        // 6. 更新密码
                        loginAccount.setPassword(newPassword);
                        return true; // 结束方法
                    } else {      //两次输入的密码不一致
                        System.out.println("您2次输入的密码不一致,请重新输入!");
                    }
                }
            } else {
                System.out.println("您输入的密码有误,请重新输入!");
            }
        }
    }

    /**
     * 转账操作
     */
    private void transferMoney() {
        System.out.println("======转账操作======");

        //1. 判断集合中至少要有2个账户才能转账,否则不能
        if (accounts.size() >= 2) {        //可以转账
            // 2. 判断当前登录账户余额是否有钱
            if (loginAccount.getMoney() > 0) { //有余额
                while (true) {
                    //3.输入对方的账号
                    System.out.println("请输入对方的卡号:");
                    String toCardId = scanner.next();
                    // 4. 判断下账号是否存在
                    // 根据用户输入的对方卡号,查询对方的账号
                    ICBCAccount toAccount = findAccountByCardId(toCardId);
                    //5. 判断对方的账户是否存在
                    if (toAccount == null) { //对方账户不存在,无法转账
                        System.out.println("您输入的卡号有误,没有对应的账户,请确认后重新输入对方的卡号");
                    } else {            //对方账户存在,可以转账
                        while (true) {
                            // 6. 输入转账金额
                            System.out.println("请输入您要转账的金额:");
                            double money = scanner.nextDouble();
                            // 7. 判断转账的金额不能大于余额
                            if (loginAccount.getMoney() < money) {
                                System.out.println("您转账的金额不能超过账户余额,账户余额是:" + loginAccount.getMoney());
                            } else {    // 余额大于转账金额
                                // 8. 转账
                                loginAccount.setMoney((loginAccount.getMoney() - money));         // 给自己余额减money
                                toAccount.setMoney(toAccount.getMoney() + money);                // 给对方账户余额+money
                                System.out.println("转账成功,您给" + toAccount.getUsername() + "转账" + money + ",您当前账户还剩余:" + loginAccount.getMoney());
                                return;     //结束方法
                            }
                        }
                    }
                }
            } else { //没有余额
                System.out.println("您的账户没有钱,无法转账!");
            }


        } else {        //只有一个账户,不可转账
            System.out.println("当前系统中,只有1个账户,无法转帐!");
        }

    }

    /**
     * 取款
     */
    private void drawMoney() {
        System.out.println("======取款操作======");

        while (true) {
            //1. 提示用户输入取款金额
            System.out.println("请输入取钱金额:");
            double money = scanner.nextDouble();

            //2. 账户余额如果大于100才能取款,小于100不能取款
            if (loginAccount.getMoney() >= 100) {
                // 3. 判断取款金额是否大于账户的余额
                if (loginAccount.getMoney() >= money) {        // 余额充足
                    //4. 判断取款金额是否超过限额
                    if (loginAccount.getLimit() < money) {      // 取款金额超过限额
                        System.out.println("取款失败, 因为您的限额是" + loginAccount.getLimit() + ",每次最多取" + loginAccount.getLimit());
                    } else {        // 取款金额没有超过限额
                        //5. 真正取款
                        loginAccount.setMoney(loginAccount.getMoney() - money);
                        System.out.println("恭喜您,取款成功!现在的余额是:" + loginAccount.getMoney());
                        break; // 结束循环
                    }

                } else {      // 余额不足,不能取款
                    System.out.println("您的账户只有" + loginAccount.getMoney() + "元,您想取" + money + "元,你想得美!请重新输入取款金额!");
                }

            } else {
                System.out.println("余额不足100,不让取款,赶紧赚钱去吧!");
                break;
            }
        }
    }

    /**
     * 存款
     */
    private void saveMoney() {
        System.out.println("======存款操作======");

        //1. 提示用户输入存款金额
        System.out.println("请输入存款金额:");
        double money = scanner.nextDouble();

        //2.将金额添加到账户中的money属性中  100 + 50 = 150
        loginAccount.setMoney(loginAccount.getMoney() + money);

        //3.提示用户存款成功
        System.out.println("存款成功!您当前账户的余额有:" + loginAccount.getMoney() + "元");
    }

    /**
     * 查询账户信息操作
     */
    private void showUserInfo() {
        System.out.println("======账户信息如下:======");
        System.out.println("您的用户名是:" + loginAccount.getUsername());
        System.out.println("您的性别是:" + loginAccount.getSex());
        System.out.println("您的卡号是:" + loginAccount.getCardId());
        System.out.println("您的余额是:" + loginAccount.getMoney());
        System.out.println("您的限额是:" + loginAccount.getLimit());
    }

    /**
     * 开户功能
     */
    private void createAccount() {
        System.out.println("======用户开户操作======");

        //1. 创建Account对象
        ICBCAccount account = new ICBCAccount();

        //2. 通过键盘录入账户的相关信息
        // 卡号:系统自动生成,无需用户录入
        String cardId = createCardId(); //返回8为卡号
        account.setCardId(cardId);

        // 姓名
        System.out.println("请录入您的姓名:");
        String username = scanner.next();
        account.setUsername(username);

        // 性别
        while (true) {
            System.out.println("请输入您的性别:");
            String sex = scanner.next();
            // 判断性别录入是否合法
            if (sex.equals("男") || sex.equals("女")) {
                account.setSex(sex);
                break; //跳出死循环
            } else {
                System.out.println("你输入的是个什么玩意儿!性别是男或者女!");
            }
        }

        // 密码
        while (true) {
            System.out.println("请输入您的密码:");
            String password = scanner.next();
            System.out.println("请确认您的密码:");
            String repeatPassword = scanner.next();
            // 判断2次输入的密码是否一致
            if (password.equals(repeatPassword)) {        //一致
                account.setPassword(password);
                break;// 跳出死循环
            } else {
                System.out.println("您输入的两次密码不一致,请重新输入!");
            }
        }

        // 限额
        System.out.println("请输入账户限额:");
        double limit = scanner.nextDouble();
        account.setLimit(limit);

        //3. 把账户添加集合中
        accounts.add(account);

        //4.提供添加成功
        System.out.println("恭喜您:" + account.getUsername() + ",开户成功!您的卡号是:【" + account.getCardId() + "】");
    }

    /**
     * 生成卡号
     */
    private String createCardId() {
        Random random = new Random();
        String cardId = "";
        while (true) {
            // 循环8次
            for (int i = 0; i < 8; i++) {
                int num = random.nextInt(10);
                cardId += num;      //循环结束后,8位卡号就生成了
            }

            // 判断卡号是否存在
            // 根据卡号在集合中查询账户对象
            ICBCAccount account = findAccountByCardId(cardId);
            if (account == null) {      // 卡号不重复返回,否则重新生成
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询账户对象
     *
     * @param cardId
     * @return
     */
    private ICBCAccount findAccountByCardId(String cardId) {
        // 遍历集合
        for (int i = 0; i < accounts.size(); i++) {
            // 获得集合中的每一个账户
            ICBCAccount account = accounts.get(i);
            // 判断生成的卡号是否和当前账户卡号一致
            if (cardId.equals(account.getCardId())) {
                return account;
            }
        }
        return null;
    }

}
