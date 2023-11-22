package cn.itcast.quickstart;

/**
 * 类与对象的注意事项
 */
public class StudentTest2 {
    public static void main(String[] args) {
        // 创建s1
        Student s1 = new Student();
        s1.name = "卧龙";
        s1.chinese = 100;
        s1.math = 100;

        // 处理s1的数据
        s1.printAvgScore();
        s1.printTotalScore();

        System.out.println("--------");

        // 创建s2
        Student s2 = new Student();
        s2.name = "凤雏";
        s2.chinese = 99;
        s2.math = 99;

        // 处理s2的数据
        s2.printTotalScore();
        s2.printAvgScore();

        System.out.println("-------");
        // 当多个变量指向同一个对象时,就会相互影响了
        s2 = s1;        // 将s1记录的地址值赋值给了s2; 变量s1和s2都指向了卧龙
        s1.chinese = 150;
        s1.printTotalScore();
        s1.printAvgScore();

        System.out.println("--------");
        s2.printTotalScore();
        s2.printAvgScore();

        // 堆内存中的对象,如果没有被指向(使用)时,这个对象就是垃圾对象,JVM会自动回收
        s1 = null;
        s2 = null;
    }
}
