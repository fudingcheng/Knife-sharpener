package cn.itcast.homework2;

/**
 * 操作类:
 * 1. 计算所有人中的最小年龄
 * 2. 计算所有人中的平均年龄
 */
public class PersonOperator {

    // 成员变量-Person数组
    private Person[] persons;

    // 通过成员变量给persons赋值
    public PersonOperator(Person[] persons) {
        this.persons = persons;
    }

    /**
     * 计算所有人中的最小年龄
     */
    public int getMinAge() {
        //定义变量,假设第一个人年龄是最小的
        int age = persons[0].getAge();
        //遍历persons,求最小值
        for (int i = 1; i < persons.length; i++) {
            Person person = persons[i];
            // 如果当前person的年龄小于age,则替换age的值
            if (person.getAge() < age) {
                age = person.getAge();
            }
        }
        return age;
    }

    /**
     * 计算所有人中的平均年龄
     */
    public double getAvgAge() {
        // 1. 定义变量,代表平均值
        double avg = 0.0;

        //2. 求所有人的年龄和
        double ageSum = 0.0;
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            ageSum += person.getAge();
        }
        //3.计算平均年龄
        avg = ageSum / persons.length;
        return avg;
    }
}
