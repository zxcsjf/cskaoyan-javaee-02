package com._11_subclassobjectinitial.homework;

import java.util.Scanner;

/**
 * 猜数字
 *
 * @author zxcsjf
 * @since 2022/06/15 14:17
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字(1~100之间的整数)：");
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);

        while (true) {
            int input = sc.nextInt();
            if (input == num) {
                System.out.println("恭喜！猜中了！");
                return;
            }
            if (input > num) {
                System.out.println("大了！请重新猜：");
            }
            if (input < num) {
                System.out.println("小了！请重新猜：");
            }
        }
    }
}
