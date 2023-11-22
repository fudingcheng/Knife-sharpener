package cn.itcast.method.define;

/**
 * 方法的定义：注意的问题
 */
public class MethodDefineDemo03 {

    //1、方法的位置放前放后无所谓
//    public static void printHelloWorld(){
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");


//    }

    public static void main(String[] args) {
        // String rs = printHelloWorld();


        //4、方法怎么定义，就只能怎么调用
//        String rs = printHelloWorld(5); //方法执行完毕
//        System.out.println("-------");
//        System.out.println(rs);     //main方法中打印方法的返回值

        // System.out.println(printHelloWorld(5)); // 可读性不高；不建议这样写

        // printHelloWorld(5);

        //调用没有返回值的方法，只能直接调用
        printHelloWorld();


        // System.out.println(rs);
    }

    // 2、方法返回值类型如果写了void，则方法不需要返回数据，方法体中就不能写return 数据
//    public static void printHelloWorld(){
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        return "打印完毕";            // 报错，不需要返回数据
//    }

    //2、方法的返回值类型写了具体的类型，方法中就必须要写return 数据，且数据的类型要和方法定义时的类型一致
//    public static String printHelloWorld(){
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        return "打印完毕";
//    }

    //3、return语句的后面，不能写代码，因为程序执行不到
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        // System.out.println("OK");
    }

    //4、方法不调用就不会执行
    public static String printHelloWorld(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
        return "打印完毕";
        // System.out.println("OK");
    }
}
