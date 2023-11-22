package cn.itcast.moive;

/**
 * 电影的操作类
 */
public class MoiveOperator {
    // 成员变量-电影数组
    private Moive[] moives;

    /**
     * 成员变量赋值
     *
     * @param moives
     */
    public MoiveOperator(Moive[] moives) {
        this.moives = moives;
    }

    /**
     * 打印所有电影信息到控制台
     */
    public void printAllMoiveMessages() {
        for (int i = 0; i < moives.length; i++) {
            Moive moive = moives[i];
            System.out.println("电影id:" + moive.getId());
            System.out.println("电影名称:" + moive.getName());
            System.out.println("电影导演" + moive.getDirector());
            System.out.println("主演:" + moive.getActor());
            System.out.println("欢迎热度:" + moive.getLike());
            System.out.println("---------");
        }
    }


    /**
     * 根据id查询某个电影是否存在
     */
    public void getMoiveById(int id) {
        for (int i = 0; i < moives.length; i++) {
            Moive moive = moives[i];
            // 当前遍历的moive的id和传递的id是否相等
            if (moive.getId() == id) {
                System.out.println("电影id:" + moive.getId());
                System.out.println("电影名称:" + moive.getName());
                System.out.println("电影导演" + moive.getDirector());
                System.out.println("主演:" + moive.getActor());
                System.out.println("欢迎热度:" + moive.getLike());
                return;
            }
        }
        System.out.println("电影没有找到!");
    }
}
