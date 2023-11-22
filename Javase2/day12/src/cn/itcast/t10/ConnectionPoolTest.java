package cn.itcast.t10;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试类
 */
public class ConnectionPoolTest {

    private static AtomicInteger gotCount = new AtomicInteger();
    private static AtomicInteger notGotCount = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        // 记录每个线程内运行的次数
        int count = 20;
        // 创建数据库连接池
        int poolSize = 10;
        ConnectionPool pool = new ConnectionPool(poolSize);

        // 批量创建线程
        int threadCount = 50;
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(threadCount);

        for (int i = 1; i <= threadCount; i++) {
            new Thread(new ThreadJob(count, pool, start, end), "线程" + i).start();
        }


        start.countDown();  // 当所有的子线程都创建完毕后再开始运行
        end.await();        // 等待所有子线程都执行完毕后再开始计数

        System.out.println("共运行了:" + count * threadCount);
        System.out.println("成功获得的线程有" + gotCount + "个");
        System.out.println("未成功获得的线程有" + notGotCount + "个");

    }


    static class ThreadJob implements Runnable {

        private ConnectionPool pool;

        private CountDownLatch start;
        private CountDownLatch end;
        private int count;

        public ThreadJob(int count, ConnectionPool pool, CountDownLatch start, CountDownLatch end) {
            this.start = start;
            this.end = end;
            this.pool = pool;
            this.count = count;
        }

        @Override
        public void run() {

            try {
                start.await();  //等待所有线程军创建完毕
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long timeRemaining = 1000;
            Connection connection = null;
            while (count > 0) {
                try {
                    connection = pool.fetchConnection(timeRemaining);
                    if (connection != null) {
                        // 成功获取连接
                        connection.createStatement();
                        connection.commit();
                        pool.releaseConnection(connection);
                        gotCount.incrementAndGet();
                    } else {
                        // 未获得到连接
                        notGotCount.incrementAndGet();
                    }
                } catch (InterruptedException | SQLException e) {
                    e.printStackTrace();
                } finally {
                    count--;
                }
            }
            end.countDown();
        }
    }
}
