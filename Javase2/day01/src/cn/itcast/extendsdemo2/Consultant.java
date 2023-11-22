package cn.itcast.extendsdemo2;

/**
 * 咨询师类
 */
public class Consultant extends People{

    private int number;

    public Consultant() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Consultant(String name) {
        this.name = name;
    }

    public Consultant(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
