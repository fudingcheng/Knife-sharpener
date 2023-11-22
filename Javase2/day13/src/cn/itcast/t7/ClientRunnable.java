package cn.itcast.t7;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientRunnable implements Runnable{
    private Socket socket;

    public ClientRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                InputStream inputStream = socket.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                String msg = dataInputStream.readUTF();
                System.out.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
