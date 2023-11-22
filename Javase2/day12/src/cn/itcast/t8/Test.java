package cn.itcast.t8;/*
   卖票案例
        导入素材中的selling-tickets-demo项目，启动demo模块下的Test类
        该类通过程序，实现了三个窗口同时卖票的基本需求

    08、分析以下需求并完成代码
        1、启动程序，程序中会出现什么错误及原因？
            答：

        2、有哪些避免错误的方案？
            答：

        3、使用两种常见方案进行代码实现，运行程序查看正确的结果（不能删减原本的代码）
            答：

    提示：重复票、负数票属于错误情况
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        //三个窗口，同时卖100张票
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
static class Ticket implements Runnable {

    private int ticketCounts = 100; //共享数据

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) { //循环卖票

            // synchronized (this) {
            /*
                循环体为操作共享数据的代码块
             */
            try {
                lock.lock();
                if (ticketCounts == 0) { //判断出口
                    break;
                } else {
                    try {
                        Thread.sleep(50); //资源调用需要时间（小睡一下）
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticketCounts--; //出票完成后，打印本次是哪个窗口出票，和剩余票数
                    System.out.println(Thread.currentThread().getName() + "卖票成功，剩余票数为：" + ticketCounts);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }
            //}
        }
    }
}
}

