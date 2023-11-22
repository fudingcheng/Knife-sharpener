package cn.itcast.homework;

import java.util.Scanner;

/*
	分析以下需求并完成代码
		提示键盘录入一个字符串, 判断字符串中大写、小写、数字、其他字符出现的次数并打印
*/
public class HomeWork1 {
    public static void main(String[] args) {
        //1. 让用户录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个字符串:");
        String str = scanner.next();

        int a = 0;  // 小写字符次数
        int b = 0;  // 大写字符次数
        int c = 0;  // 数字次数
        int d = 0;  // 其他字符次数

        //2. 遍历字符串[abc123ABC]
        for (int i = 0; i < str.length(); i++) {
            // 获得字符串中每个字符
            char cc = str.charAt(i);
            // 3. 判断字符是数字\小写字符\大写字母\其他
            if (cc >= 'a' && cc <= 'z') { //小写字母
                a++;
            } else if (cc >= 'A' && cc <= 'Z') {//大写字母
                b++;
            } else if (cc >= 49 && cc <= 57) {      //数字:比较数字的范围,要用ascii中的字符数字的范围
                c++;
            } else { // 其他字符
                d++;
            }
        }

        //4. 输出结果
        System.out.println("[" + str + "]这个字符串中有" + a + "个小写字母," + b + "个大写字母," + c + "个数字和" + d + "个其他字符");
    }
}
