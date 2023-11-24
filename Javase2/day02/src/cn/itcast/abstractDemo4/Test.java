package cn.itcast.abstractDemo4;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("讲师",30);
        lecturer.show();

        System.out.println("---------");

        Counselor counselor = new Counselor("咨询",20);
        counselor.show();
    }
}
