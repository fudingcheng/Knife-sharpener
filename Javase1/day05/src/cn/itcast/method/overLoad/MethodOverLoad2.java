package cn.itcast.method.overLoad;

/**
 * 开发一个系统，发射武器
 */
public class MethodOverLoad2 {
    public static void main(String[] args) {
        sendWeapon();
        sendWeapon("米国");
        sendWeapon("岛国",10);
    }

    // 默认：给岛国送一枚导弹
    public static void sendWeapon() {
        //System.out.println("给岛国送一枚导弹");
        sendWeapon("岛国",1);
    }

    // 给指定的地区送一枚导弹
    public static void sendWeapon(String area) {
        //System.out.println("给" + area + "送一枚导弹");
        sendWeapon(area,1);
    }

    // 给指定的地区送N枚导弹
    public static void sendWeapon(String area, int num) {
        System.out.println("给" + area + "送" + num + "枚导弹");
    }

}
