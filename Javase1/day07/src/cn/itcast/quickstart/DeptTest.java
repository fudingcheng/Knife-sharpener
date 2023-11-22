package cn.itcast.quickstart;

/**
 * 测试类:计算部门的总成绩
 */
public class DeptTest {
    public static void main(String[] args) {
        // 创建部门对象:研发部门
        Dept d1 = new Dept();
        d1.name = "研发部";
        d1.peopleNum = 10;
        d1.salary = 20000;

        // 通过对象调方法: 研发部的工资总和
        d1.printTotalSalay();

        System.out.println("-----------");

        // 创建部门对象:市场部门
        Dept d2 = new Dept();
        d2.name = "市场部";
        d2.peopleNum = 100;
        d2.salary = 2000;

        // 通过部门调用方法:市场部的工资总和
        d2.printTotalSalay();

    }
}
