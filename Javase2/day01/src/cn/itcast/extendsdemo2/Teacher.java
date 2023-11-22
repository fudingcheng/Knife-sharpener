package cn.itcast.extendsdemo2;

/**
 * 讲师类
 */
public class Teacher extends People{

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Teacher() {
    }

    public Teacher(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }
}
