package com._19_io._05_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 带缓冲区的文件输出流
 * @author zxcsjf
 * @since 2022/06/24 11:14
 */
public class DemoBufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufin = new BufferedInputStream(new FileInputStream("fos.txt"));

        int readData = bufin.read();

        System.out.println(readData);

    }
}
