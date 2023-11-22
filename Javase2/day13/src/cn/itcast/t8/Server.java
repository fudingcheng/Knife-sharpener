package cn.itcast.t8;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 创建服务端的ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(8080);

       while (true){
           // 接受客户端的请求,创建socket对象
           Socket socket = serverSocket.accept();

           new Thread(()->{
               // 给客户端返回数据, HelloWorld
               OutputStream outputStream = null;
               try {
                   outputStream = socket.getOutputStream();
                   // 封装了一个给浏览器端返回数据的打印流
                   PrintStream print = new PrintStream(outputStream);
                   print.println("HTTP/1.1 200 OK");
                   print.println("Content-Type: text/html; charset=UTF-8");
                   print.println();
                   print.println("<h2 style='color:red;font-size:120px;text-align:center'>helloworld</h2>");
                   print.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }).start();

       }
    }
}
