package com.lcscim.study.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端  发送数据");
        Socket client = new Socket("localhost",6666);
        OutputStream os = client.getOutputStream();
        os.write("你好么？tcp,我来了".getBytes());
        InputStream is = client.getInputStream();
        byte[] b = new byte[100];
        int len = is.read(b);
        System.out.println(new String(b,0,len));
        is.close();
        os.close();
        client.close();
    }
}
