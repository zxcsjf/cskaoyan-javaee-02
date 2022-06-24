package com._19_io.homework;

import java.io.*;
import java.util.Objects;

/**
 * (选做)递归查找指定目录中(包括子目录中)，所有的.java文件，
 * 并且，把所有这些找到的java文件，复制(是复制不是移动)到一个指定的目录下
 *
 * @author zxcsjf
 * @since 2022/06/24 20:33
 */
public class Solution5 {
    public static void main(String[] args) throws IOException {
        String src = "D:\\Wangdao\\uncleTao";
        String dest = "D:\\copy";

        copyFileAndDir(src, dest);
        System.out.println("备份完成！！！");

    }

    /**
     * 递归拷贝指定文件夹内全部文件和文件夹
     * 本质还是三步：
     * 1. 读入旧文件字节数组
     * 2. 写出到新文件
     * 3. 关闭资源
     * 细节：
     * 1. 判断原路径是否为文件夹
     * 如果原路径是文件，则直接拷贝到目标目录；若原路径是文件夹，则在目标目录下新建一个与原路径文件夹同名的文件夹。
     * 2. 遍历目录
     * 如果原路径是目录，则依次遍历原目录下的文件和文件夹。若遍历到文件，则将文件拷贝到目标目录新建的文件夹里；如果是文件夹，则递归。
     *
     * @param src
     * @param dest
     * @return void
     * @author zxcsjf
     * @since 2022/06/24 20:53
     */
    private static void copyFileAndDir(String src, String dest) throws IOException {
        // 参数校验
        File oddFile = new File(src);
        File newFile = new File(dest, oddFile.getName());
        if (!oddFile.exists()) {
            throw new FileNotFoundException("传入的目录或者文件不存在!!");
        }
        //如果src是目录
        if (oddFile.isDirectory()) {
            newFile.mkdir();
            // 列出目录下的所有文件包括目录
            File[] files = oddFile.listFiles();
            // 排除空文件夹情况
            for (File f : Objects.requireNonNull(files)) {
                if (f.isDirectory()) {
                    copyFileAndDir(f.toString(), newFile.toString());
                } else {
                    // 如果是文件则添加到当前目录下
                    FileInputStream in = new FileInputStream(f);
                    // 创建新字节输出流，并且文件路径是文件夹名字 + 相对路径名字。
                    FileOutputStream out = new FileOutputStream(new File(newFile.toString(), f.getName()));
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) != -1) {
                        out.write(buf, 0, len);
                    }
                    out.close();
                    in.close();
                }
            }
        } else {
            // src是文件
            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
            out.close();
            in.close();
        }
    }
}

//
//     /**
//      * 拷贝文件
//      *
//      * @param null
//      * @return
//      * @author zxcsjf
//      * @since 2022/06/24 20:55
//      */
//     public static void copyFile(File oldFile, File newFile) throws IOException {
//         // 创建输入输出出流
//         FileInputStream in = new FileInputStream(oldFile);
//         // File destFile = new File(newFile.getPath());
//         System.out.println(newFile.getAbsolutePath());
//         FileOutputStream out = new FileOutputStream(newFile.getAbsolutePath() + ".pdf", true);
//         byte[] bytes = new byte[1024];
//         int readCount;
//         while ((readCount = in.read(bytes)) != -1) {
//             out.write(bytes, 0, readCount);
//         }
//         in.close();
//         out.close();
//     }
