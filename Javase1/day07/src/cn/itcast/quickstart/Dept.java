package cn.itcast.quickstart;

/**
 * 部门类
 */
public class Dept {

    // 成员变量:直接写到类中,
    String name;    // 部门名称
    int peopleNum;  // 部门人数
    double salary;  // 人员工资


    public static void main(String[] args) {
        String name1;   // 局部变量,写在方法中
    }

    // 成员方法
    /**
     * 计算部门的总工资
     */
    public void printTotalSalay() {
        System.out.println(name + "的总工资是" + peopleNum * salary);
    }

}
