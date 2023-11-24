package cn.itcast.abstractDemo2;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println(name + "喵喵叫");
    }
}
