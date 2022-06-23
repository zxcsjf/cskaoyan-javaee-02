package com._16_string.homework;

/**
 * 举例： 在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * 中java出现了5次
 * <p>
 * 提示：可以考虑使用indexOf方法，仅考虑本题举出的字符串，无需复杂考虑
 *
 * @author zxcsjf
 * @since 2022/06/21 19:34
 */
public class Solution4 {
    public static void main(String[] args) {
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        int countOfJava = 0;
        for (int i = 0; i < str.length();) {
            // i 作为查找的下标依据
            // 从0开始，如果没找到，就跳出循环
            if (str.indexOf("java", i) == -1) {
                break;
            }
            // 运行到这里，说明找到了"java"
            countOfJava++;
            // 下一次找的起始下标是当前找到的"java"下标 + "java".length()
            i = str.indexOf("java", i) + "java".length();
        }
        System.out.println("java出现了" + countOfJava + "次！");
    }
}
