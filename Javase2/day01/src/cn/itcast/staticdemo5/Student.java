package cn.itcast.staticdemo5;

/**
 * static的注意事项
 */
public class Student {

    static String schoolName;
    double score;

    //类方法可以访问类成员变量,但是不能访问实例变量
    public static void printHelloWorld() {
        System.out.println(schoolName);
//        System.out.println(this);// 类方法中不能访问this
//        System.out.println(score);  // 不能访问
    }


    // 实例方法可以访问类成员,也能访问实例变量
    public void printPass() {
        System.out.println(schoolName);
        System.out.println(score);
//        System.out.println(this);  //成员方法中可以访问this
    }

}

