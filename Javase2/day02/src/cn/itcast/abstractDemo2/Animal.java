package cn.itcast.abstractDemo2;

/**
 * 抽象类:应用场景
 */
public abstract class Animal {

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String name;

    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
