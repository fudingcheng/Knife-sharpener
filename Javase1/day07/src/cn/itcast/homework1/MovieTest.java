package cn.itcast.homework1;

/**
 * 测试类
 */
public class MovieTest {
    public static void main(String[] args) {
        // 1. 实例化3个movie对象
        Movie movie1 = new Movie("战狼", "吴京", "动作");

        Movie movie2 = new Movie();
        movie2.setTitle("阿凡达");
        movie2.setDirector("詹姆斯卡梅隆");
        movie2.setType("科幻");

        Movie movie3 = new Movie("流浪地球", "吴京", "科幻");

        //2. 将三个对象添加到数组中
        // int[] arr = {0,1,2};  int类型数组
        Movie[] movies = {movie1, movie2, movie3};

        //3. 遍历数组
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            String director = movie.getDirector();
            if (director == "吴京") {
                System.out.println(movie.getTitle() + "-" + movie.getDirector() + "-" + movie.getType());
            }
        }
    }
}
