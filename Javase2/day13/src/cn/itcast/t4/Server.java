package cn.itcast.t4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器端接受用户数据
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //1. 创建服务器端socket对象
        ServerSocket serverSocket = new ServerSocket(8888);

        //2. 接受客户端的请求,并获得socket管道对象
        Socket socket = serverSocket.accept();

        //3. 通过管道对象获得输入流,接受客户端发送的数据
        InputStream inputStream = socket.getInputStream();
        //byte[] bytes = inputStream.readAllBytes();
        //System.out.println(new String(bytes));

        DataInputStream dataInputStream = new DataInputStream(inputStream);

        String data = dataInputStream.readUTF();
        System.out.println(data);

        //4. 释放资源
        dataInputStream.close();
        socket.close();

    }


}
