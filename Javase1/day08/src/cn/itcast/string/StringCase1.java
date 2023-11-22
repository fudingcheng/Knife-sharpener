package cn.itcast.string;

import java.util.Scanner;

/**
 * 字符串案例:登录
 */
public class StringCase1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("程序已经启动");
        for (int i = 0; i < 3; i++) {
            //1. 获得用户输入的用户名和密码

            //提示用户输入用户名
            System.out.println("请输入您的用户名:");
            String username = scanner.next();

            //提示用户输入密码
            System.out.println("请输入您的密码:");
            String password = scanner.next();

            //2. 判断用户名和密码是否正确
            boolean rs = login(username, password);

            //3. 根据rs的值,给用户相应的提示
            if (rs) { //登陆成功
                System.out.println("恭喜您登录成功!");
                //登录成功,跳出循环
                break;
            } else {
                if (i == 0 || i == 1) {
                    System.out.println("您的用户名或者密码有误,请重新登陆!您还有【" + (2 - i) + "】次机会!");
                } else {
                    System.out.println("您的账户已被锁定,请明天再来登录!");
                }
            }
        }

    }

    /**
     * 处理业务登录
     *
     * @param username
     * @param password
     * @return
     */
    private static boolean login(String username, String password) {
        String okUsername = "itheima";
        String okPasswrod = "123456";

        // 判断用户输入的username和password是否和okUsername\okPasswrod一致
//        if (username.equals(okUsername) && password.equals(okPasswrod)) { //登录成功
//            return true;
//        } else {
//            return false;
//        }

        return username.equals(okUsername) && password.equals(okPasswrod);

    }
}
