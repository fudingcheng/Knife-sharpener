package cn.itcast.t7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * TCP服务器端接受用户数据
 */
public class Server {
    public static ArrayList<Socket> sockets = new ArrayList<Socket>();

    public static void main(String[] args) throws Exception {

        //1. 创建服务器端socket对象
        ServerSocket serverSocket = new ServerSocket(8888);




        while (true) {
            // 2. 循环接受客户端的请求,建立连接
            Socket socket = serverSocket.accept();

            // 把socket连接保存到集合中
            sockets.add(socket);

            //3. 把接收到的请求,交给子线程处理
            new Thread(new ServerRunnable(socket)).start();

        }



        //4. 释放资源
        // inputStream.close();
        // socket.close();
    }
}
