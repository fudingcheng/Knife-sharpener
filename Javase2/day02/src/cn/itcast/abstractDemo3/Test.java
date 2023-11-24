package cn.itcast.abstractDemo3;

/**
 * 测试模板设计模式
 */
public class Test {

    public static void main(String[] args) {

        Actor actor = new Actor();
        actor.sing();

        System.out.println("----------");

        Actress actress = new Actress();
        actress.sing();

    }

}
