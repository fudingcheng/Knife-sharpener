package cn.itcast.moive;

/**
 * 电影的实体类
 */
public class Moive {

    // 成员变量
    private int id;                     //电影编号
    private String name;                //电影名称
    private String director;            //电影导演
    private String actor;               //电影主演
    private String desc;                //电影简介
    private double like;                //电影评分

    public Moive() {
    }

    public Moive(int id, String name, String director, String actor, String desc, double like) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.desc = desc;
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getLike() {
        return like;
    }

    public void setLike(double like) {
        this.like = like;
    }
}
