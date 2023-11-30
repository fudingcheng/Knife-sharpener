package cn.itcast.object;

/**
 * 对象的克隆
 */
public class Test2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(1, "张三", "123", new double[]{11, 1, 22.2, 33.3});
        User user2 = user.clone();

    }
}
