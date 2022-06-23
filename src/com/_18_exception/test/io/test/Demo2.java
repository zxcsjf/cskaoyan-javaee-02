package com._18_exception.test.io.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zxcsjf
 * @since 2022/06/23 16:29
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        OutputStream out = new FileOutputStream("a.txt");
        // write(int b) 写单个字节
        // out.write(67);
        // write(byte[] b) 写字节数组
        byte[] bytes = new byte[10];
        bytes[9] = 'a';
        System.out.println(bytes[2]);
        out.write(bytes);
        // getBytes()方法把字符串转为字节数组
        // out.write("\rhello world shanjifei!!!".getBytes());
        // out.write(System.lineSeparator().getBytes());
        // // 关闭资源
        out.close();
        char[] chars = new char[10];
        System.out.println(chars[1]=='\u0001');
    }
}
