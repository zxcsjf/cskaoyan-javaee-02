package com._05_oop._05_homework;

/**
 * 练习使用递归 递归在实际开发中用途并不广泛，但我们仍有必要学习它的基本使用。
 * 这道题目如果想不明白，那就百度一下吧。
 * <p>
 * 使用递归，把十进制正整数（N>=0）转换成二进制数
 *
 * @author zxcsjf
 * @since 2022/06/10 18:48
 */
public class Solution3 {
    public static void main(String[] args) {
        int decimalNum = 0;

        System.out.print(decimalNum + "转换为二进制后是：");
        decimalToBinary(decimalNum);

    }

    private static void decimalToBinary(int dec) {
        //如果商是0了，表示递归需要结束了
        if (dec > 0) {
            //只要商不是0，就继续递归
            decimalToBinary(dec / 2);
        }
        System.out.print(dec % 2);
    }
}
