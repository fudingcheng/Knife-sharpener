package cn.itcast.variable;

/**
 * 变量的注意事项
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        // 变量要先声明才能使用
        int age = 18;
        System.out.println(age);

        // 变量的类型一旦声明后，就只能存储对应类型的数据
        int age2= 18;
        // age2 = 18.0;    // int 类型的变量不能存储小数

        // 要在变量声明的范围内使用，否则会报错
        // 在同一个范围内，不能声明2个相同名称的变量

        int age3 = 35;
        {
            //int age3= 30;
            System.out.println(age3);
        }

        System.out.println(age3);


        System.out.println("-------------");

        // 变量使用前，变量一定要先赋值，否则会报错
        int age4=0;       // 声明了一个变量，意思申请了一块内存空间，里面没有值
        age4 = age4+1;
        System.out.println(age4);

        int age5=10;
        System.out.println(age5);


    }
}
