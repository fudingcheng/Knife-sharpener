package cn.itcast.t6;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class MyRunnable implements Runnable{

    private Socket socket;
    public MyRunnable(Socket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            while (true) {
                try {
                    String data = dataInputStream.readUTF();
                    System.out.println(socket.getRemoteSocketAddress()+data);
                } catch (Exception e) {
                    SocketAddress address = socket.getRemoteSocketAddress();
                    System.out.println(address+"下线了");
                    dataInputStream.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
