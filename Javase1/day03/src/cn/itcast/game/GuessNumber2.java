package cn.itcast.game;


import java.util.Random;        // 1. 导入Random
import java.util.Scanner;

/**
 * 猜数字游戏.数字的范围1~100
 */
public class GuessNumber2 {
    public static void main(String[] args) {
        // 创建Random对象
        Random random = new Random();

        // 生成一个1~100之间的随时数
        int luckNumer = random.nextInt(100) + 1;

        // 生成一个Scanner对象,用于接受用户输入的数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("猜数字游戏开始,请输出一个数字吧...");
        //定义一个变量,记录猜的次数
        int count = 0;
        // 用户开始不停的猜数字,直到猜中为止
        while (true) {
            count++;
            // 接受用户输入的数字
            int guessNumber = scanner.nextInt();

            // 用用户输入的数字与幸运数字比较
            if (guessNumber > luckNumer) {        // 猜大了
                System.out.println("您输入的数字大了");
            } else if (guessNumber < luckNumer) { // 猜小乐
                System.out.println("您输入的数字小了");
            } else {        //猜中了
                System.out.println("你太厉害了,猜了"+count+"次终于猜中了,幸运数字是:" + luckNumer);
                break; // 猜中后,游戏结束
            }
        }
    }
}
