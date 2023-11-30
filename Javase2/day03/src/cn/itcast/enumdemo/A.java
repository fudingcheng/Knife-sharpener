package cn.itcast.enumdemo;

/**
 * 枚举类
 */
public enum A {
    // X,Y,Z都是枚举类的对象
    X, Y, Z;

    String name;

    A() {
    }

    A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
