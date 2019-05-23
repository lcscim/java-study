package com.lcscim.study.demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器 启动");
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(()->{
                try {
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".txt"));
                    byte[] b = new byte[1024 * 8];
                    int len;
                    while ((len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }
                    System.out.println("back......");
                    OutputStream out = accept.getOutputStream();
                    out.write("上传成功".getBytes());
                    out.close();
                    bos.close();
                    bis.close();
                    accept.close();
                    System.out.println("文件已上传保存");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
