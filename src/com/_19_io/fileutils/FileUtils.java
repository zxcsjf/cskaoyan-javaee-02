package com._19_io.fileutils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author zxcsjf
 * @since 2022/06/24 11:19
 */
public class FileUtils {
    // 单字节复制
    public static void copyBySingleByte(InputStream in, OutputStream out) throws IOException {
        int readData;
        // 1. 单字节复制
        while ((readData = in.read()) != -1) {
            // 写入
            out.write(readData);
        }
        out.close();
        in.close();
    }

    // 复制字节流
    public static void copyByBytes(InputStream in, OutputStream out) throws IOException {
        int readCount;
        byte[] bytes = new byte[1024];
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes, 0, readCount);
        }
        out.close();
        in.close();
    }
}
