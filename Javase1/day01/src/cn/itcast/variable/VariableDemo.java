package cn.itcast.variable;

/**
 * 变量
 */
public class VariableDemo {
    public static void main(String[] args) {
        // 声明一个变量age，记录年龄18
        int age = 18;
        System.out.println(age);
        //System.out.println(18);
        System.out.println("---------------");
        // 变量的好处；
//        System.out.println(19);
//        System.out.println(19);
//        System.out.println(19);

        int age2 = 19;
        System.out.println(age2);
        System.out.println(age2);
        System.out.println(age2);

        System.out.println("----------");

        // 变量的特点; 通过操作变量来操作数据
        int age3 = 20;
        System.out.println(age3);
        age3 = age3 + 1;
        System.out.println(age3 + 1);


        System.out.println("------------------");
        //  变量的应用场景
        // 需求：小明的钱包有9.5元；发了3元红包，收了5元的红包；计算下现在红包里有多少钱
        double money = 9.5; //声明变量money，代表了小明的钱包余额
        money = money - 3;    // 发红包3元
        money = money + 5;  // 收了5元
        System.out.println(money);  // money代表了钱包最后还有多少钱
        System.out.println("money");    //打印字符串money，而不是money变量的值

        int age5 = 10;

        int manAge = 30;
        int high = 168;
        System.out.println("小明的身高是：168");

    }
}
