package cn.itcast.method.returnDemo;

/**
 * return 关键字：设计一个方法，计算2个数相除的结果
 */
public class ReturnDemo {

    public static void main(String[] args) {
        //int rs = chu(1, 2);
        chu(1, 0);
    }

    public static void chu(int a, int b) {
        // 判断被除数b是否为0，如果为0程序就不继续执行，否则就进行计算
        if (b == 0) {
            System.out.println("当前数据是非法的，请重新计算");
            return;     // 停止方法
        }
        int c = a / b;
    }
}
