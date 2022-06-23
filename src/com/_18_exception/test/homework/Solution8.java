package com._18_exception.test.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 键盘输入文件名，文件内容，按照输入的文件名，文件内容保存。
 * <p>
 * 要求:  输入内容的时候可以多次追加写入
 * ，以一个约定字符串表示结束输出内容，
 * 比如当输入end时表示终止内容输入。
 *
 * @author zxcsjf
 * @since 2022/06/23 21:54
 */
public class Solution8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String filename = null;
        String contains = null;
        System.out.println("输入文件名：");
        filename = sc.nextLine();
        System.out.print("请输入文件内容：");

        FileWriter fw = new FileWriter("D:\\temp\\" + (filename.trim() + ".txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        while (true) {
            contains = sc.nextLine();
            if (contains.equals("end")) {
                break;
            }
            bw.write(contains);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
