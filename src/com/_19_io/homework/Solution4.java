package com._19_io.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 在一个磁盘的文件里保存26个英文小写字母（乱序），将他们读入内存中，进行排序，把排好顺序的数再重新追加写到磁盘的该文件中。
 *
 * @author zxcsjf
 * @since 2022/06/24 20:30
 */
public class Solution4 {
    public static void main(String[] args) throws IOException {
        // 其实本题可以直接按需写入26个小写英文字母
        File file = new File("Hw4.txt");
        FileInputStream in = new FileInputStream(file);
        byte[] bytes = new byte[26];
        in.read(bytes);
        for (int i = 0; i < bytes.length; i++) {
            Arrays.sort(bytes);
        }
        FileOutputStream out = new FileOutputStream("Hw4.txt");
        out.write(bytes);
        out.close();
    }
}
