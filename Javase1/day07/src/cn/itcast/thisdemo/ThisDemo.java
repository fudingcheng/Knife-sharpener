package cn.itcast.thisdemo;

/**
 * 测试this关键字
 */
public class ThisDemo {
    public static void main(String[] args) {
        //创建s1
        Student s1 = new Student();
        s1.printThis();
        System.out.println(s1); //地址值

        System.out.println("------");
        //创建s2
        Student s2 = new Student();
        s2.printThis();
        System.out.println(s2);

        System.out.println("---------");

        s1.score = 500;
        s1.checkPass(300);

    }
}
