package cn.itcast.extendsdemo8;

/**
 * 子类构造方法执行时,会先执行父类的构造器,应用场景
 */
public class Test2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zs", 30, "Java");
        System.out.println(teacher);
    }
}

/**
 * 父类
 */
class People {
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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

/**
 * 老师类
 */
class Teacher extends People {
    String skill;

    public Teacher() {
    }

    public Teacher(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill='" + skill + '\'' +
                '}';
    }
}
