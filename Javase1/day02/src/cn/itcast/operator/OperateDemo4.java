package cn.itcast.operator;

/**
 * 关系运算符
 */
public class OperateDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a > b);  // false
        System.out.println(a >= b); //false
        System.out.println(a < b);  // true
        System.out.println(a <= b); //true
        // ==:代表的是比较2个数是否相等
        // =：代表赋值
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }
}
