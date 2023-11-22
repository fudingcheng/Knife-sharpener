package cn.itcast.homework2;

public class PersonTest {
    public static void main(String[] args) {
        // 1. 创建实体类,封装数据
        Person person1 = new Person("玄德", 39);
        Person person2 = new Person("云长", 35);
        Person person3 = new Person("翼德", 34);

        // 2. 创建操作类,处理数据
        Person[] persons = {person1, person2, person3};
        PersonOperator personOperator = new PersonOperator(persons);

        // 求3个人的最小年龄
        int minAge = personOperator.getMinAge();
        System.out.println("三个人的最小年龄是:"+minAge);

        // 求3个人的平均年龄
        double avgAge = personOperator.getAvgAge();
        System.out.println("3个人的平均年龄是:"+avgAge);
    }
}
