package cn.itcast.branch;

/**
 * switch的注意事项:
 *  case后的值不能重复,且case后的值只能写字面量,不能写变量
 */
public class SwitchDemo3 {
    public static void main(String[] args) {

        // 定义一个变量,代表当前的星期
        String week = "周五";

        switch (week){
            case "周一":
                System.out.println("埋头苦干,解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("数据有问题");
        }

    }
}
