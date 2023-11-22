package cn.itcast.n3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP:服务端
 */
public class Server {

    public static void main(String[] args) throws Exception {
        //1. 创建服务端对象
        DatagramSocket serverSocket = new DatagramSocket(6666);

        //2. 创建一个数据包对象, 用于接受客户端的数据
        byte[] bytes = new byte[1024 * 64];       // 创建接收包
        int length = bytes.length;      //接收包的大小
        DatagramPacket datagramPacket = new DatagramPacket(bytes, length);

        while (true) {
            //3. 接受客户端的数据
            serverSocket.receive(datagramPacket);
            String data = new String(bytes,0,datagramPacket.getLength());
            System.out.println(datagramPacket.getSocketAddress()+":"+data);

        }


        //4. 释放资源
        // serverSocket.close();
    }

}
