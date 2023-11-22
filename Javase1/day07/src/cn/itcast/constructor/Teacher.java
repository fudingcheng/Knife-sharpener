package cn.itcast.constructor;

/**
 * 老师类:
 *  1.如果开发者在编写类时,没有提供无参构造方法,java会自动提供一个
 *  2.如果开发者在编写类时,提供了一个有参的构造方法,那么Java就不会再提供一个无参构造方法了
 */
public class Teacher {
    public String name;

    public Teacher(){
    }

    //2.如果开发者在编写类时,提供了一个有参的构造方法,那么Java就不会再提供一个无参构造方法了,开发者自己写一个无参构造
    public Teacher(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }
}


class TeacherTest{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "zs";
        t1.printName();
    }
}