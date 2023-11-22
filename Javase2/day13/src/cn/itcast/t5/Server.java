package cn.itcast.t5;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

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
        while (true) {
            try {
                String data = dataInputStream.readUTF();
                System.out.println(data);
            } catch (Exception e) {
                SocketAddress address = socket.getRemoteSocketAddress();
                System.out.println(address+"下线了");
                socket.close();
                serverSocket.close();
                break;
            }
        }

        //4. 释放资源
        // inputStream.close();
        // socket.close();
    }
}
