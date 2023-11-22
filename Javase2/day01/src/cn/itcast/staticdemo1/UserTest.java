package cn.itcast.staticdemo1;

/**
 * 统计用多少用户登录系统
 */
public class UserTest {

    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();
        new User();
        new User();

        System.out.println("一共创建了:" + User.number + "个用户");
    }
}
