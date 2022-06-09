package com._02_homework;

import java.util.Scanner;

/**
 * 键盘录入一个int数字，判断它是奇数还是偶数。
 *
 * @author zxcsjf
 * @since 2022/06/07 19:05
 */
public class Solution6_04 {
    public static void main(String[] args) {
        System.out.print("输入一个int：");
        Scanner scanner4 = new Scanner(System.in);
        isOddOrEven(scanner4);

    }

    private static void isOddOrEven(Scanner sc) {
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数。");
        } else {
            System.out.println(num + "是奇数。");
        }
    }
}
