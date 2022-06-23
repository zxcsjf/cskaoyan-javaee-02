package com._18_exception.test.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author zxcsjf
 * @since 2022/06/23 14:36
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("D:\\");
        // System.out.println(file.createNewFile());
        // System.out.println(File.createTempFile("test", "01"));
        // file.mkdirs();
        // file.mkdir()
        file.exists();

        // System.out.println(file.renameTo(new File("test03.txt")));

        // System.out.println(Arrays.toString(file.list()));
        // System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles();
        System.out.println(files[1]);

        findAllJavaFiles(new File("D:\\Wangdao\\jdbc\\jdbc-demo\\src\\com\\itheima\\jdbc"));

    }

    public static void findAllJavaFiles(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                if (files[i].getName().endsWith(".java")) {
                    System.out.println(files[i].getAbsolutePath());
                }
            } else {
                findAllJavaFiles(file);
            }
        }
    }
}
