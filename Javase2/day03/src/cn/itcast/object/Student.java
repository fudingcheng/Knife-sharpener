package cn.itcast.object;

import java.util.Objects;

/**
 * Object的API
 */
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 如果当前对象的地址和比较对象o的地址一样,就直接返回true
        if (this == o) return true;
        // 如果比较对象是null,或者当前对象的class类型和比较对象的class类型不一致,就直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 把比较对象转换为Student对象
        Student student = (Student) o;
        // 比较当前对象的属性值和o的属性值是否相等
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
