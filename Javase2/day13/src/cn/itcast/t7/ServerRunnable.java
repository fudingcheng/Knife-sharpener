package cn.itcast.t7;

import java.io.*;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * TCP服务端,群聊
 */
public class ServerRunnable implements Runnable{

    private Socket socket;
    public ServerRunnable(Socket socket) {
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
                    sendMsgToAll(socket.getRemoteSocketAddress()+data);
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

    private void sendMsgToAll(String msg) throws Exception {
        for (Socket onlineSocket : Server.sockets) {
            OutputStream outputStream = onlineSocket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(msg);
            dataOutputStream.flush();
        }
    }
}
