package cn.itcast.homework;

import java.util.Scanner;

/*
	分析以下需求并完成代码
        提示键盘录入一个包含数字和字母的字符串
        遍历字符串, 按照数字在前字母在后的规则, 组成一个新的字符串并打印
*/
public class HomoWork2 {
    public static void main(String[] args) {
        //1. 键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个字符串:");
        String str = scanner.next();

        String numScope = "0123456789";
        String charScope = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String numStr = "";
        String charStr = "";

        //2. 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 获得每个字符
            char c = str.charAt(i);
            //3. 判断当前的字符是数字还是字母
            if (numScope.contains(c + "")) {      // 当前的字符c是数字
                numStr += c;
            } else if (charScope.contains(c + "")) {   // 当前的字符c是字母
                charStr +=c;
            }
        }

        System.out.println("结果:"+(numStr+charStr));
    }
}
