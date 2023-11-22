package cn.itcast.n2;

import java.io.IOException;
import java.net.*;

/**
 * UDP客户端:发消息
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 创建客户端对象
        DatagramSocket clientSocket = new DatagramSocket(9999);

        //2. 封装要发出去的数据包
        byte[] bytes = "客户端说:你好呀".getBytes();      //发送的数据
        int length = bytes.length; //数据长度
        InetAddress address = InetAddress.getLocalHost();   //服务器端的地址
        int port = 6666;       // 服务器端程序的端口号
        DatagramPacket packet = new DatagramPacket(bytes, length, address, port);

        //3. 发送数据
        clientSocket.send(packet);
        System.out.println("客户端发送数据完毕");

        //4. 释放资源
        clientSocket.close();
    }
}
