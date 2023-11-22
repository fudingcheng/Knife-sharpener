package cn.itcast.loop;

/**
 * while循环
 */
public class WhileDemo {
    public static void main(String[] args) {
        // 使用while循环打印3遍HelloWorld
        int i = 0;
        while (i < 3) {
            System.out.println("HelloWorld");
            i++;        // 这一行代码千万不能忘记,否则循环就不能停止,也就是死循环
        }
        System.out.println(i);      // i在while循环外可以使用
    }
}
