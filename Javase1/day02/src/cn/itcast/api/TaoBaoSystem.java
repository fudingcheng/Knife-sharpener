package cn.itcast.api;

import java.util.Scanner;

/**
 * 需求：
 * 1、程序启动后，提示用户输入用户名、年龄
 * 2、输入完毕后，打印在控制台
 * 3、提示用户成功进入系统
 * <p>
 * 使用Java中的Scanner
 */
public class TaoBaoSystem {

    public static void main(String[] args) {
        //1、创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //2、输出提示信息
        System.out.println("欢迎您登录系统...");

        // 接受用户输入的姓名
        System.out.println("请输入您的姓名:");
        // 接受用户输入的姓名
        String name = sc.next();
        System.out.println("您的姓名是：" + name);

        // 接受用户输入的年龄
        System.out.println("请输入您的年龄:");
        // 接受用户输入的年龄
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);

        // 提示信息：姓名是XXX的用户，年龄XXX岁，成功登录到了系统
        System.out.println("姓名是"+name+"的用户，年龄"+age+"岁，成功登录到了系统");

    }

}
