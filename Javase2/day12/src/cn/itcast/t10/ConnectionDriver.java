package cn.itcast.t10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

/**
 * 使用动态代理创建数据库连接
 */
public class ConnectionDriver {

    public static Connection createConnection() {

        Connection connection = (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(), new Class[]{Connection.class}, new ConnectionHanlder());

        return connection;
    }

    static class ConnectionHanlder implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("commit".equalsIgnoreCase(method.getName())) {
                TimeUnit.MILLISECONDS.sleep(200);
            }
            return null;
        }
    }
}
