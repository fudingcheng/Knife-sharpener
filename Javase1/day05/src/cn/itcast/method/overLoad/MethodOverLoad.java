package cn.itcast.method.overLoad;

/**
 * 方法的重载
 */
public class MethodOverLoad {
    public static void main(String[] args) {
        //printHelloWorld();
        //printHelloWorld(1,"test");
        //printHelloWorld("test",1);

        printNH();//打印依次
        printNH(5);// 打印5次
    }

    public static void printHelloWorld() {
        System.out.println("HelloWorld");
    }

    public static void printHelloWorld(String name, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
    }

    public static void printHelloWorld(int num, String name) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
    }

    // 不是方法的重载，因为参数名称不同，不会对方法体的实现有影响
//    public static void printHelloWorld(int num1, String name2) {
//        for (int i = 0; i < num1; i++) {
//            System.out.println("HelloWorld");
//        }
//    }

    // 方法的重载只和方法名、形参数有关，与其他（返回值、修饰符）无关
//    public static String printHelloWorld(int num) {
//        for (int i = 0; i < num; i++) {
//            System.out.println("HelloWorld");
//        }
//        return "OK";
//    }

    public static void printNH(){
        System.out.println("你好");
    }

    public static void printNH(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("你好");
        }
    }

}
