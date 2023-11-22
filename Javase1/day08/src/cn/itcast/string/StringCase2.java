package cn.itcast.string;

import java.util.Random;

/**
 * 字符串案例2:生成验证码
 */
public class StringCase2 {
    public static void main(String[] args) {
        // 生成指定位数的验证码
        String code = createCode(4);
        System.out.println(code);
    }

    /**
     * 生成指定位数的验证码
     *
     * @param n
     * @return
     */
    private static String createCode(int n) {

        //1. 把生成验证码需要的字符保存起来
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();

        // 创建一个字符串变量,拼接随机产生的每个字符
        String code = "";

        //2. 循环n次,生成n个随机字符
        for (int i = 0; i < n; i++) {
            //3. 在0~61之间产生一个随机数
            int randomIndex = random.nextInt(62);
            //4. 根据randomIndex在str中获取一个字符串
            code += str.charAt(randomIndex);
        }

        return code;
    }
}
