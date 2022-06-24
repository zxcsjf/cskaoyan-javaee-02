package com._19_io._04_bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/24 11:01
 */
public class DemoBufferedOutPutSream {
    public static void main(String[] args) throws IOException {
        // 1. 创建缓冲输出流对象
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("fos.txt"), 4);

        // 2. write
        // 单字节
        out.write('\u0031');
        // 多字节
        out.write("我永远喜欢青山七海！！！".getBytes());

        // 3. flush 冲刷
        out.flush();

        // 4. 关闭缓冲输出流
        out.close();

    }
}
