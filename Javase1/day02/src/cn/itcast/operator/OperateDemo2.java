package cn.itcast.operator;

/**
 * 自增自减运算符：++/--
 */
public class OperateDemo2 {
    public static void main(String[] args) {
        int i = 10;
        // i++;
        //++i;    // 如果变量单独操作，++/-- 写在前面和后面的效果是一样的
        //System.out.println(i);  //11

        i++; // i = i+1;
        i--; // i = i-1

        int j = 20;
        //int rs = j + i++;
        int rs2 = j + ++i;
        // System.out.println(rs);     //30 ;++符号在变量的后面；所以先运算后++
        System.out.println(rs2);       // 31
        System.out.println(i);          //11


        // System.out.println(10++);       // ++/--符号只针对变量使用，不能用作字面量

        System.out.println("------");

//        int a = 10;
//        int rs3 = ++a;
//        System.out.println(rs3);    //11
//        System.out.println(a);      //11

        int a = 10;
        int rs3 = a++;
        System.out.println(rs3);    //10
        System.out.println(a);      //11

    }
}
