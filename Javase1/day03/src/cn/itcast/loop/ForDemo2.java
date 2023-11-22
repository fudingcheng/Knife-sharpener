package cn.itcast.loop;

/**
 * for 批量生产数据
 */
public class ForDemo2 {
    public static void main(String[] args) {
        // 需求1:批量生产1~100之间的整数
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

        // 需求2:求1-100之间的和
        /**
         * 1. 获取1-100之间的数
         * 2. 把1-100之间的数加起来
         */

        // 需求2: 声明变量记录1-100之间的和
//        int sum = 0;
//
//        // 1. 获取1-100之间的数
//        for (int i = 1; i <= 100; i++) {
//            //sum = sum + i;
//            sum +=i;
//        }
//        System.out.println(sum);


        // 需求3: 声明变量记录1-100之间奇数的和
        /**
         * 1. 获取1-100之间的奇数
         * 2. 把1-100之间的奇数加起来
         */

//        int sum = 0;
//
//        // 获取1-100之间的奇数--方案一
//        for (int i = 1; i <=100 ; i+=2) {
//            sum +=i;
//        }
//        System.out.println(sum);

        int sum = 0;
        // 获取1-100之间的奇数--方案二
        for (int i = 1; i <= 100; i++) {
            // 只取奇数
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
