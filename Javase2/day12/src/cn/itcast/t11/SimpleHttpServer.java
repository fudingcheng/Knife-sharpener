package cn.itcast.t11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {


    public static void main(String[] args) throws IOException {
        // 设置basePath
        String basePath = "/Users/fudingcheng/Documents/server";
        // 连接池
        DefaultThreadPool<HttpRequestHandler> threadPool = new DefaultThreadPool<>(10);

        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket accept = null;
        while ((accept = serverSocket.accept()) != null) {
            threadPool.execute(new HttpRequestHandler(accept, basePath));
        }

    }


    /**
     * 处理http请求
     */
    static class HttpRequestHandler implements Runnable {

        private Socket socket;
        private String basePath;
        private BufferedReader reader;
        private PrintWriter out;

        public HttpRequestHandler(Socket socket, String basePath) {
            this.socket = socket;
            this.basePath = basePath;
        }

        @Override
        public void run() {
            try {
                // 将字节流转化为字符流,方便读取
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = reader.readLine();
                String path = line.split(" ")[1];
                String file = basePath + path;
                // 根据路径读取本地的资源
                System.out.println(file);
                OutputStream outputStream = socket.getOutputStream();
                out = new PrintWriter(outputStream);
                out.println("HTTP/1.1 200 OK");
                out.println("Server: myTomcat");
                if (file.endsWith("jpg")) {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    out.println("Content-Type: image/jpeg");
                    out.println();
                    int len;
                    byte[] bytes = new byte[1024];
                    while ((len = bis.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                    }
                    outputStream.flush();
                } else if (file.endsWith("txt")) {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String l;
                    out.println("Content-Type: text/html;charset=utf-8");
                    out.println();
                    while ((l = br.readLine()) != null) {
                        out.println(l);
                    }
                }
                out.flush();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                /*try {
                    socket.close();
                    reader.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        }
    }

}
