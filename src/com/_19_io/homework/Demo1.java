package com._19_io.homework;

import java.io.*;

/**
 * @author zxcsjf
 * @since 2022/06/24 22:51
 */
public class Demo1 {
    // a.txt中有字符串   "五五开卢本伟white"
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out1 = new FileOutputStream("b.txt");
        FileOutputStream out2 = new FileOutputStream("c.txt");
        copyFile(in, out1);
        copyFile(in, out2);
        in.close();
        out1.close();
        out2.close();
    }

    public static void copyFile(InputStream in, OutputStream out) throws IOException {
        int readCount;
        byte[] bytes = new byte[1024];
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }
    }
}
