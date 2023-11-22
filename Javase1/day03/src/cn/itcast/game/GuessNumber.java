package cn.itcast.game;

       // 导入了Random的包

import java.util.Random;

/**
 * 生成随机数
 */
public class GuessNumber {
    public static void main(String[] args) {
        // 生成一个随机数

         int a = 1 , b = 1;
        System.out.println(a);  //1
        System.out.println(b);  //1

        // 创建random对象
        Random random = new Random();

        /**
         * 生成了0~10之间的随机数
         * 1. 导包 java.util.Random;
         * 2. 创建对象 Random random = new Random();
         * 3. 通过对象调用方法 random.nextInt(10); // 10就是生成随机数的范围; 0~10;
         */

//        for (int i = 0; i < 100; i++) {
//            // 调用random的功能,获取随机数;需要在括号中()指定生成随机数的范围; 生成0~10之间的随机数
//            int num = random.nextInt(10);// 生成0~10之间的随机数; 默认就是从0开始的,包左不包右[0,10)
//            System.out.println(num);
//        }


        /**
         * 生成了1~5之间的随机数
         * 1. 导包 java.util.Random;
         * 2. 创建对象 Random random = new Random();
         * 3. 通过对象调用方法 random.nextInt(6); // a=1;b=5   b-a +1 = 4
         *
         * 生成任意的a~b的随机数的结论:
         *  括号中填: b-a+1;
         *  括号外面+a
         */
//        for (int i = 0; i < 100; i++) {
//            int num2 = random.nextInt(5) + 1;
//            System.out.println(num2);
//        }

        // 生成 36~79
        for (int i = 0; i < 100; i++) {
            int num2 = random.nextInt(44) + 36;
            System.out.println(num2);
        }
    }
}
