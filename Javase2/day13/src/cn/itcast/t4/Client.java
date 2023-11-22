package cn.itcast.t4;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP:客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 创建客户端的socket对象,指定服务器的IP和端口,建立与服务器端的连接管道
        Socket socket = new Socket("127.0.0.1", 8888);

        //2. 从连接管道中获得一个字节输出流,用来给服务器端发送数据
        OutputStream outputStream = socket.getOutputStream();

        //3. 给服务器端发送数据
        // outputStream.write(("客户端说:"+123).getBytes());

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeUTF("客户端说:你好呀");
        dataOutputStream.flush();
        System.out.println("客户端发送完毕");


        //4. 释放资源
        // outputStream.close();
        // socket.close();
    }
}
