package cn.itcast.object;

public class User implements Cloneable {

    private int id;
    private String username;
    private String password;
    private double[] scores;

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        // 调用父类对象进行克隆
        User user2 = (User) super.clone();
        user2.scores = this.scores.clone();
        return user2;
    }
}
