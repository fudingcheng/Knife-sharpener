package cn.itcast.t9;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 管道输入输出流,用于线程间的通信,主线程输入,子线程输出
 */
public class PipedStream {

    public static void main(String[] args) throws IOException {
        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();

        out.connect(in);
        //in.connect(out);

        Thread writerThread = new Thread(() -> {

            String msg = "中国";

            try {
                out.write(msg);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }, "writerThread");

        Thread readerThread = new Thread(() -> {
            try {
                int i;
                while ((i=in.read())!=-1){
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }, "readerThread");

        readerThread.start();
        writerThread.start();

    }
}

