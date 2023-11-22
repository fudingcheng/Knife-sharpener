package cn.itcast.homework1;

/**
 * 电影实体类
 */
public class Movie {
    private String title;   //片名
    private String director; //导演
    private String type;    //类型

    public Movie() {
    }

    public Movie(String title, String director, String type) {
        this.title = title;
        this.director = director;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
