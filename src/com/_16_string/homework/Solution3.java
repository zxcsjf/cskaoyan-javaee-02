package com._16_string.homework;

import java.util.Arrays;

/**
 * 把字符串"lengendary"中字符 改成间隔大写小写模式，
 * 即 "LeNgEnDaRy"
 *
 * 提示:
 *      借助StringAPI  toLowerCase() 把字符串全部转化为小写
 *      String toUpperCase() 把字符串全部转换为大写
 *
 * @author zxcsjf
 * @since 2022/06/21 19:20
 */
public class Solution3 {
    public static void main(String[] args) {
        String str = "lengendary";
        String[] splitString = str.split("");
        for (int i = 0; i < splitString.length; i+=2) {
            splitString[i] = splitString[i].toUpperCase();
        }
        // 把修改后的字符数组，重新组成字符串
        // 只能用StringBuffer或StringBuilder,
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < splitString.length; i++){
            sb. append(splitString[i]);
        }
        String res = sb.toString();
        System.out.println(res);
    }
}
