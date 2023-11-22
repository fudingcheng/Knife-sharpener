package cn.itcast.constructor;

/**
 * 构造器:
 *  1. 就是一个方法
 *  2. 方法名和类名一样
 */
public class Student {

    String name;        //学生的名字

    /**
     * 无参构造器
     */
    public Student(){
        System.out.println("构造器执行了...");
    }

    /**
     * 有参构造器
     * 作用: 给对象的成员变量赋值
     * @param name
     */
    public Student(String name){
        int age=0;    // 局部变量
        System.out.println(age);
        System.out.println(this.name);
        this.name = name;       // 给对象的成员变量赋值
    }

        }