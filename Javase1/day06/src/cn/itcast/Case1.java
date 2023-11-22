package cn.itcast;

/**
 * 买飞机票
 */
public class Case1 {
    public static void main(String[] args) {

        // 机票的价格与什么有关:原价,月份,舱位
        double price = 1000;
        int month = 8;
        String type = "经济舱";

        //计算优惠价格
        double preferentialPrice = calculatePlanPrice(price, month, type);
        System.out.println(preferentialPrice);
    }

    public static double calculatePlanPrice(double price, int month, String type) {
        //1. 判断月份是淡季还是旺季;
        if (month >= 5 && month <= 10) {   //旺季:5-10;
            // 判断舱位;头等舱/经济舱
            switch (type) {
                case "头等舱":
//                  price = price * 0.9;
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *=0.85;
                    break;
            }
        } else {              // 淡季:11-4
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *=0.65;
                    break;
            }
        }
        return price;
    }
}
