package cn.itcast.operator;

/**
 * 逻辑运算符
 */
public class OperateDemo5 {
    public static void main(String[] args) {
        double screen = 6.5;
        double storage = 128;

        // 搜索数据，屏幕大于6.8，并且 内存大于100G 就满足条件
        // 多个条件都满足，那么用&符号
        System.out.println(screen > 6.8 & storage > 100);

        // 搜索数据，屏幕大于6.8，或者 内存大于100G 就满足条件
        // 多个条件，只要满足一个就返回结果，那么用|符号
        System.out.println(screen > 6.8 | storage > 100);

        System.out.println(!true);      // 对true取反
        System.out.println(!(2 > 1));     // 先运算2>1 = true；再对true取反，结果false

        //条件1 ^ 条件2； 结果：当条件1的结果和条件2结果相同时，^返回false；否则返回true
        System.out.println(true ^ true);
        System.out.println((2 < 1) ^ (100 > 50));   // false

        System.out.println(false & (2 > 1));    //false
        System.out.println(false && (2 > 1));   //false，性能高，推荐使用；逻辑或一样的

    }
}
