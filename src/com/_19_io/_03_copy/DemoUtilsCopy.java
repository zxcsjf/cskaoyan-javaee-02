package com._19_io._03_copy;

import com._19_io.fileutils.FileUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/24 11:29
 */
public class DemoUtilsCopy {
    public static void main(String[] args) throws IOException {
        FileUtils.copyBySingleByte(new FileInputStream("fos.txt"), new FileOutputStream("fos3.txt"));
        FileUtils.copyByBytes(new FileInputStream("fos.txt"), new FileOutputStream("fos2.txt"));
    }
}
