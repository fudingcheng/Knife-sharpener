package cn.itcast.api;

import java.util.Scanner;

/**
 * 	运行效果:
 *         请输入您注册的用户名:
 *         Tony
 *         请输入您的密码:
 *         itheima-yyds
 *         请输入您的手机号:
 *         15612341234
 *         请输入您的邮箱:
 *         Tony@itheima.com
 *         请输入接受到的验证码520888:
 *         520888
 *
 *         注册成功!您的账户信息为：
 *         Tony
 *         itheima-yyds
 *         15612341234
 *         Tony@itheima.com
 */
public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("请输入您注册的用户名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("请输入您注册的密码:");
        String password = sc.next();

        System.out.println("请输入您注册的手机号:");
        long tel = sc.nextLong();

        System.out.println("请输入您的邮箱:");
        String email = sc.next();

        System.out.println("请输入您接受到的验证码:");
        int code = sc.nextInt();

        System.out.println("注册成功！您的信息为：");
        System.out.println(name);
        System.out.println(password);
        System.out.println(tel);
        System.out.println(email);
    }
}
