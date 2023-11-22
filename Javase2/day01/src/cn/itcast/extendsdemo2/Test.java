package cn.itcast.extendsdemo2;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建讲师对象
        Teacher teacher = new Teacher("张三","Java讲师");
        System.out.println(teacher.getName()+":"+teacher.getSkill());
        // 创建咨询师对象
        Consultant consultant = new Consultant("李四",100);
        System.out.println(consultant.getName()+":"+consultant.getNumber());
    }
}
