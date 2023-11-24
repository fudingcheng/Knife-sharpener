package cn.itcast.interfaceDemo3;

public class Student {
    private String name;
    private double score;
    private char sex;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", sex=" + sex +
                '}';
    }

    public Student() {
    }

    public Student(String name, double score, char sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
