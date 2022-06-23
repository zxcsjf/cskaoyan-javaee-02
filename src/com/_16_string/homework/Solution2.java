package com._16_string.homework;

/**
 * "peter piper picked a peck of pickled peppers"
 * 统计这段绕口令有多少个以p开头的单词
 * <p>
 * 提示:借助split(" ")方法分隔成字符串数组 , startsWith("p")判断是否是p开头
 *
 * @author zxcsjf
 * @since 2022/06/21 19:17
 */
public class Solution2 {
    public static void main(String[] args) {
        String str = "peter piper picked a peck of pickled peppers";
        String[] strings = str.split(" ");
        int count = 0;
        for (String string : strings) {
            if (string.startsWith("p")) {
                count++;
            }
        }
        System.out.println("统计这段绕口令有" + count + "个以p开头的单词");
    }
}
