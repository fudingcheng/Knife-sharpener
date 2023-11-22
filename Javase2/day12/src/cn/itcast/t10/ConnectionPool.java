package cn.itcast.t10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 数据库连接池
 */
public class ConnectionPool {

    private static LinkedList<Connection> pool = new LinkedList<Connection>();
    private static Logger logger = LoggerFactory.getLogger(ConnectionPool.class);

    public ConnectionPool(int poolSize) {
        if (poolSize > 0) {
            for (int i = 0; i < poolSize; i++) {
                pool.add(ConnectionDriver.createConnection());
            }
        }
    }

    /**
     * 归还连接
     *
     * @param connection
     */
    public static void releaseConnection(Connection connection) {
        synchronized (pool) {
            if (connection != null) {
                //归还连接,并切唤醒等待的线程
                pool.addLast(connection);
                pool.notifyAll();
                logger.info("归还了连接");
            }
        }
    }

    /**
     * 超时获取链接
     *
     * @param timeout
     * @return
     */
    public static Connection fetchConnection(long timeout) throws InterruptedException {
        synchronized (pool) {
            if (timeout < 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            }else{
                long futrue = System.currentTimeMillis() + timeout;
                long timeRemaining = timeout;
                // 线程池的连接为空,则进行超时等待
                while (pool.isEmpty() && timeRemaining > 0) {
                    logger.info("未获得连接,进入了等待");
                    pool.wait(timeRemaining);
                    timeRemaining = futrue - System.currentTimeMillis();
                }

                //超时等待结束,
                Connection connection = null;
                if (!pool.isEmpty()) {
                    connection = pool.removeFirst();
                    logger.info("获得了连接");
                }
                return connection;
            }
        }
    }
}
