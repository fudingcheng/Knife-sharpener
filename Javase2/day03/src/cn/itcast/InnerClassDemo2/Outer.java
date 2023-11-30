package cn.itcast.InnerClassDemo2;

/**
 * 内部类
 */
public class Outer {

    private static String schoolName = "黑马程序员";
    public String name = "外部类name";
    private int age = 50;

    public Outer() {
    }

    public Outer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test1() {
        System.out.println("外部类test1...");
        System.out.println(name);
        System.out.println(age);
    }

    /**
     * 内部类
     */
    static class Inner {
        public static String a = "A";
        public String name = "内部类name";
        private int age = 100;

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner() {
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

        public void test2() {
            System.out.println("内部类test2...");
            /**
             * 静态内部类,只能访问外部静态成员
             */
            // System.out.println(Outer.this.age);
            System.out.println("内部类age:" + this.age);
            System.out.println(schoolName);
            System.out.println(a);
        }

    }

}
