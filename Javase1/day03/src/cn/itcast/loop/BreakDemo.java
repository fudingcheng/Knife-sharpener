package cn.itcast.loop;

/**
 * Break continue 案例
 */
public class BreakDemo {
    public static void main(String[] args) {
        // 需求1:你犯错了,你女朋友罚你打扫卫生10天,到第三天时候,你女朋友心软了,后面就不用了
        for (int i = 1; i <= 10; i++) {
            System.out.println("打扫卫生第" + i + "天");
            // i=3的时候代表当前循环执行了3次,也就是说打扫了3天卫生
            if (i == 3) {
                break;      // 结束循环
            }
        }

        // 需求2:你犯错了,你女朋友罚你打扫卫生10天,前3天表现特别好,第四天放假1天,后面继续
        for (int i = 1; i <= 10; i++) {

            // i=4的时候,放假一天不干了;第4天跳出当次的循环, 循环从第5次继续开始
            if (i == 4) {
                continue;       // 不结束循环,只跳出档次的循环
            }

            System.out.println("打扫卫生第" + i + "天");
        }
    }
}
