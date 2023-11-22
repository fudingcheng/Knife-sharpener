package cn.itcast.atm;

/**
 * 账户实体类
 */
public class ICBCAccount {
    private String cardId;      //卡号
    private String username;    //姓名
    private String sex;         //性别
    private String password;    //密码
    private double money;       //余额
    private double limit;       //取现额度

    public ICBCAccount() {
    }

    public ICBCAccount(String cardId, String username, String sex, String password, double money, double limit) {
        this.cardId = cardId;
        this.username = username;
        this.sex = sex;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUsername() {
        if (this.sex.equals("男")) {
            return username + "先生";
        } else if (this.sex.equals("女")) {
            return username + "女士";
        }
        return "";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
