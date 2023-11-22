package cn.itcast.method.define;

/**
 *  方法的定义：打印3行helloworld
 */
public class MethodDefineDemo02 {
    public static void main(String[] args) {
        // printHelloWorld();
        printHelloWorld(30);
    }


    // 无参数、无返回值的方法
//    public static void printHelloWorld(){
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//        System.out.println("HelloWorld");
//    }

    // 有参数，无返回值的方法
    // 打印HelloWorld，由调用者来决定打印多少遍
    public static void printHelloWorld(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
    }

}
