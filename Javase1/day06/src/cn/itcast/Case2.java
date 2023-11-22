package cn.itcast;

import java.util.Random;

/**
 * 生成验证码
 */
public class Case2 {
    public static void main(String[] args) {

        String code = generateCode(10);
        System.out.println(code);
    }

    public static String generateCode(int n) {

        Random random = new Random();
        //用来拼接生成的每个字符/数组
        String code = "";

        // 1. 循环n次,给每位上生成一个验证码
        for (int i = 0; i < n; i++) {
            //2. 生成0,1,2 三个之间的一个随机数
            int randomNum = random.nextInt(3);
            //3. 判断randomNum的值是多少
            switch (randomNum) {
                case 0:     // 生成数字
                    // int code1 = random.nextInt(10);
                    code += random.nextInt(10);
                    break;
                case 1:     // 生成小写字母
                    // 返回 97-122 的随机数
                    code += (char) (random.nextInt(122 - 97 + 1) + 97);       //
                    break;
                case 2:     // 生成大写字母
                    // 返回 65-90 的随机数
                    code += (char) (random.nextInt(90 - 65 + 1) + 65);
                    break;
            }
        }
        return code;
    }
}
