package cn.itcast.staticdemo4;

/**
 * 获取验证码
 */
public class LoginDemo {
    public static void main(String[] args) {
        System.out.println(LoginUtils.createCode(5));
    }
}
