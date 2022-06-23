package com._18_exception.test.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * 分别键盘输入 文件名 和 文件内容，
 * 并按照文件名保存相应的文件内容
 *
 * @author zxcsjf
 * @since 2022/06/23 21:08
 */
public class Solution7 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String filename = null;
        String filecontains = null;

        System.out.println("输入文件名：");
        filename = scan.nextLine();
        System.out.print("请输入文件内容：");
        filecontains = scan.nextLine();
        scan.close();

        // new一个File对象，包含文件路径信息
        File file = new File("D:\\temp\\"+ (filename.trim() + ".txt"));

        // new一个输出流对象
        FileOutputStream out = new FileOutputStream(file);
        // 写入字节数组
        out.write(filecontains.getBytes());
        // 关闭输出流
        out.close();
    }
}
