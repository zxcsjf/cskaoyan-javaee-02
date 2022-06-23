package com._18_exception.test.homework;

import java.io.File;

/**
 * 递归删除目录与文件 给大家发一个app2目录
 * ,里面是多级目录与文件,使用递归的方式,将该目录里面的文件
 * ,目录全删除了.(目录为空才可以删)
 * 注意: 不要放在C盘
 *
 * @author zxcsjf
 * @since 2022/06/23 19:44
 */
public class Solution4 {
    public static void main(String[] args) {
        File dir = new File("E:\\App2");
        delFileAndDir(dir);
    }

    /**
     * 递归方式删除指定文件夹内全部文件和文件夹
     *
     * @param dir
     */
    private static void delFileAndDir(File dir) {
        // 判断，如果dir对象不存在，直接返回
        if (!dir.exists()) {
            return;
        }
        // 判断，如果dir对象不是一个目录而是文件
        // 或者 是一个空目录
        //      直接删除
        if (dir.isFile() || dir.list().length == 0) {
            dir.delete();
            return;
        }
        // 程序执行到这里，那么一定是一个目录，且不是空目录
        // 当前路径下的所有文件和目录的 File对象数组
        File[] files = dir.listFiles();
        for (File f : files) {
            // 如果是文件就删除
            if (f.isFile()) {
                f.delete();
            } else {
                // 如果是目录，则调用递归方法
                delFileAndDir(f);
                //删除本层空目录
                f.delete();
            }
        }
        // 最后删除这个空目录
        dir.delete();
    }
}

