package cn.itcast.branch;

import com.sun.security.jgss.GSSUtil;

/**
 * 分支结构:if
 */
public class IfDemo {
    public static void main(String[] args) {
        // 需求1: 商场入口扫描用户的体温,如果体温高于37度,就提示:这个家伙体温有些高!!

        // 定义一个变量,记录用户的体温
        double temperature = 40;
        // 判断用户的体温是否超过预警的温度
        if (temperature > 37){
            System.out.println("警告:这个家伙体温有些高");
        }



        //需求2: 购物支付时,用户的余额如果大于订单金额,则提示:支付成功,否则提示:支付失败

        // 定义一个变量,记录用户的余额
        double price = 600;
        double orderPrice = 500;
        // 支付时做判断:  用户的余额如果大于订单金额,则提示:支付成功,否则提示:支付失败
        if (price > orderPrice) {     // 可以支付
            System.out.println("支付成功");
        } else {  //不能支付
            System.out.println("支付失败");
        }

        System.out.println("-----------------");

        // 需求3:给员工打绩效,如果绩效分数在0~60:D     60~80:C     80~90:B     90~100:A

        // 定义一个变量记录员工的绩效分数
        int score = -1;
        if (score >= 0 && score < 60) {    //D
            System.out.println(score + "对应的绩效等级是D");
        } else if (score >= 60 && score < 80) {
            System.out.println(score + "对应的绩效等级是C");
        } else if (score >= 80 && score < 90) {
            System.out.println(score + "对应的绩效等级是B");
        } else if (score >= 90 && score < 100) {
            System.out.println(score + "对应的绩效等级是A");
        }else{
            System.out.println("绩效分数非法!");
        }

    }
}
