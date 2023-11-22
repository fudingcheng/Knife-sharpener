package cn.itcast.branch;

import java.math.BigDecimal;

/**
 * switch的注意事项:变量的支持的类型
 */
public class SwitchDemo2 {
    public static void main(String[] args) {

        // switch的变量类型只能是:byte\short\int\char\String
        String a = "1";
        switch (a){

        }
        //switch的变量类型不支持浮点型,java在做小数运算时,结果不准确
        double m = 1.1;
        double n = 2.2;
        double z = m+n;
        System.out.println(z == 0.3);
        System.out.println("------");


        BigDecimal bigDecimal1= new BigDecimal("0.4443");
        BigDecimal bigDecimal2= new BigDecimal("0.4354");

        BigDecimal rs = bigDecimal1.add(bigDecimal2);
        System.out.println(rs.doubleValue());



    }
}
