package cn.itcast.abstractDemo2;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println(name + "汪汪叫");
    }
}
