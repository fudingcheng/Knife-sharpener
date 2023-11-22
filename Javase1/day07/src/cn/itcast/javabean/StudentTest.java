package cn.itcast.javabean;

/**
 * 学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建学生实体类对象,封装学生数据
        Student s1 = new Student("宋义刚", 20, 25);

        // 创建学生操作类对象,处理学生处理
        StudentOperator studentOperator1 = new StudentOperator(s1);

        studentOperator1.printTotalScore();
        studentOperator1.printAvgScore();

        System.out.println("----------");


        // 封装数据
        Student s2 = new Student();
        s2.setName("李芃欣");
        s2.setChinese(30);
        s2.setMath(20);

        // 处理数据
        StudentOperator studentOperator2 = new StudentOperator(s2);

        studentOperator2.printTotalScore();
        studentOperator2.printAvgScore();


    }
}
