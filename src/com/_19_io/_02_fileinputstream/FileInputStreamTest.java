package com._19_io._02_fileinputstream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/24 09:53
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("a.txt");
        int readCount;
        byte[] bytes = new byte[1024];
        while ((readCount = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readCount));
        }
        in.close();
    }
}
