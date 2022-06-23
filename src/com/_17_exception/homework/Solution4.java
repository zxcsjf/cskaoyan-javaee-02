package com._17_exception.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * 创建一个长度是8的的字符串数组
 * 使用8个长度是5的随机字符串初始化这个数组
 * 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 * 注1： 不能使用Arrays.sort() 要自己写 可以使用冒泡排序
 * 注2： 无视大小写，即 Axxxx 和 axxxx 没有先后顺序
 * 举例: 排序前 [UxoEl, If3js, 9SSwC, czHuA, lZLBF, IhynX, VgjrY, dJAIW]
 * 排序后 [9SSwC, czHuA, dJAIW, If3js, IhynX, lZLBF, UxoEl, VgjrY]
 *
 * @author zxcsjf
 * @since 2022/06/22 16:37
 */
public class Solution4 {
    public static void main(String[] args) {
        String[] strings = new String[8];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = getRandomString(5);
        }
        // Arrays.sort(strings);
        System.out.println("排序前：");
        System.out.print("[");
        for (String string : strings) {
            System.out.print(string + ", ");
        }
        System.out.print("\b\b]");

        String[] res = arraySort(strings);
        System.out.println("\n排序后：");
        System.out.print("[");
        for (String re : res) {
            System.out.print(re + ", ");
        }
        System.out.print("\b\b]");
    }

    //生成指定length的随机字符串（A-Z，a-z，0-9）
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static String[] arraySort(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j].compareToIgnoreCase(input[j + 1]) > 0) {
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

}
