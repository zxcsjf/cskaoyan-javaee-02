package com._19_io._02_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/23 17:38
 */
public class DemoInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("a.txt");
        while (true) {
            int readData = in.read();
            if (readData == -1) {
                break;
            }
            System.out.println((char) readData);
        }
        in.close();
    }
}
