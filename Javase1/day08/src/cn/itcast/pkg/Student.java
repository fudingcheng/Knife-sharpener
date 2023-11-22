package cn.itcast.pkg;



import cn.itcast.pkg.itcast.Person;

// 在同一个类中,导入了不同包下的相同名称的程序,是不允许的!
// import cn.itcast.pkg.itheima.Person;

import java.util.Random;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //1. 如果使用的程序在同一个包下,不需要导包
        new PkgDemo();

        //2.如果要使用其他包下的程序(类),需要导包滴
        new Scanner(System.in);
        new Random();
        new Person();

        //3.如果使用的是java.lang包下的程序,是不需要导包的
        new String();

        //4. 如果调用2个程序,他们的名称相同,但是包不同,只能导入一个,另一个带着包名访问
        new Person();                           //cn.itcast.pkg.itcast.Person
        new cn.itcast.pkg.itheima.Person();     // cn.itcast.pkg.itheima.Person

    }
}
