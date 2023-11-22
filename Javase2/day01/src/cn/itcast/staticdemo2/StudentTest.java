package cn.itcast.staticdemo2;

/**
 * 学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {

        // 执行类方法
        Student.printHelloWorld();
        new Student().printHelloWorld();        // 不推荐

        // 成员方法执行
        new Student().printPass();
    }
}
