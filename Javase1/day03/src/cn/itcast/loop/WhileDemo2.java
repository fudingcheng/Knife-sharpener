package cn.itcast.loop;

/**
 * while循环:珠穆朗玛峰案例
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        // 需求:一张纸的厚度是0.1mm,珠峰的高度是8848.86m,请问折纸多少次,能超过珠峰的高度

        //纸张的高度
        double paper = 0.1;                  // 单位mm
        // 珠峰的高度
        double qomolangma = 8848.86 * 1000;         // m → mm
        // 声明一个变量,代表折纸的次数
        int count = 0;
        while (paper < qomolangma) {     // 如果纸张的厚度小于珠峰的厚度,就继续折纸
            count++;
            //折纸
            paper *= 2; //paper = paper * 2;
        }
        System.out.println(count);

    }
}
