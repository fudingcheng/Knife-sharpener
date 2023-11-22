package cn.itcast.t6;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器端多收
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //1. 创建服务器端socket对象
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = null;


        while (true) {
            // 2. 循环接受客户端的请求,建立连接
            socket = serverSocket.accept();

            //3. 把接收到的请求,交给子线程处理
            new Thread(new MyRunnable(socket)).start();

        }



        //4. 释放资源
        // inputStream.close();
        // socket.close();
    }
}
