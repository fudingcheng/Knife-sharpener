package cn.itcast.t7;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP:客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 创建客户端的socket对象,指定服务器的IP和端口,建立与服务器端的连接管道
        Socket socket = new Socket("127.0.0.1", 8888);

        // 创建子线程读取服务器端发送的数据
        new Thread(new ClientRunnable(socket)).start();

        //2. 从连接管道中获得一个字节输出流,用来给服务器端发送数据
        OutputStream outputStream = socket.getOutputStream();



        //3. 给服务器端发送数据
        // outputStream.write(("客户端说:"+123).getBytes());

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入:");
            String line = scanner.nextLine();
            if("q".equalsIgnoreCase(line)){
                System.out.println("欢迎下次光临");
                dataOutputStream.close();
                socket.close();
                break;
            }
            dataOutputStream.writeUTF("客户端说:"+line);
            dataOutputStream.flush();
            System.out.println("客户端发送完毕");
        }

        //4. 释放资源
        // outputStream.close();
        // socket.close();
    }
}
