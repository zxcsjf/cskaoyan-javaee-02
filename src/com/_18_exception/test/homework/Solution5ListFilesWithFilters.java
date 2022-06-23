package com._18_exception.test.homework;

import java.io.File;
import java.io.FileFilter;

/**
 * 带过滤器的listFiles方法练习 自己做一个目录，里面放些一下文件，文件夹
 * 用带过滤器的listFiles方法进行筛选
 * <p>
 * 条件一：仅留下文件夹名包括a的文件夹
 * 条件二：仅留下.txt结尾的文本文件
 * 条件三：仅留下以a开头的文件
 *
 * @author zxcsjf
 * @since 2022/06/23 20:24
 */
public class Solution5ListFilesWithFilters {
    public static void main(String[] args) {
        File file = new File("E:\\temp");

        // Lambda表达式创建一个过滤器
        FileFilter fileFilter = dir -> {
            // // 条件是 dir对象是一个文件并且它的名字以txt结尾
            // return dir.isFile() && dir.getName().endsWith(".txt");

            // 仅留下文件夹名包括a的文件夹
            // return dir.isFile() && dir.getName().contains("a");

            // 仅留下以a开头的文件
            return dir.isFile() && dir.getName().startsWith("a");

        };

        // 在有过滤器的情况下创建一个File[]数组，并且遍历
        File[] files = file.listFiles(fileFilter);
        for (File f : files) {
            System.out.println(f);
        }
    }
}