package cn.itcast.enumdemo;

/**
 * 枚举类
 */
public class Test2 {

    public static void main(String[] args) {
        provideInfo(Constant.boy);
    }

    public static void provideInfo(Constant sex) {
        switch (sex) {
            case boy:
                System.out.println("男孩");
                break;
            case girl:
                System.out.println("女孩");
                break;
        }
    }

}
