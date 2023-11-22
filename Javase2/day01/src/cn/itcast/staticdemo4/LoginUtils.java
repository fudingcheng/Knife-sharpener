package cn.itcast.staticdemo4;

import java.util.Random;

/**
 * 工具类
 */
public class LoginUtils {

    /**
     * 私有构造方法
     */
    private LoginUtils() {

    }

    public static String createCode(int n) {

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
