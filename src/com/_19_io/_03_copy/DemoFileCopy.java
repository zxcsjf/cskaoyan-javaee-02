package com._19_io._03_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/24 10:04
 */
public class DemoFileCopy {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileInputStream in = new FileInputStream("C:\\Users\\ShanJifei\\Downloads\\Norwayin8KWorld(60FPS).webm");
        // 创建输出流对象
        FileOutputStream out = new FileOutputStream("8k.webm");
        // 边读边写
        // 复制完成
        int readData;
        byte[] bytes = new byte[1024 * 1024 * 2040];
        long start = System.nanoTime();
        // 1. 单字节复制
        // while ((readData = in.read()) != -1) {
        //     // 写入
        //     out.write(readData);
        // }

       // 2. 1024字节数组复制
        while ((readData = in.read(bytes)) != -1) {
            out.write(bytes, 0, readData);
        }

        // 3.
        long end = System.nanoTime();
        System.out.println("复制耗时：" + (end - start));
        // close释放资源，
        in.close();
        out.close();
    }
}
