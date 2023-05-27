package cn.itcast;

import java.util.Scanner;

/**
 * 键盘录入Demo
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1、接受用户输入的姓名
        System.out.println("请输入您的姓名：");
        String name = scanner.next();
        //2、接受用户输入的年龄
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        //3、打印欢迎语句：欢迎您：XXX登陆系统
        System.out.println("欢迎您～"+name+"登陆到系统");
    }
}
