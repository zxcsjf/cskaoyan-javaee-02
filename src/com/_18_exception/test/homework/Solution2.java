package com._18_exception.test.homework;

import java.util.Scanner;

/**
 * Scanner进行键盘录入时，非常容易产生异常，那么就有必要进行处理 我们在进行键盘录入字符串操作时
 * ，有时需要把一个字符串转换成int类型。但如果输入的字符串并不是一个数字时，
 * 显然是不能转换成功的，而是会抛出一个异常。
 * 要求： 处理该异常，让程序不会报错终止，而是让用户重新输入，直到输入正确的数字为止
 *
 * @author zxcsjf
 * @since 2022/06/23 19:26
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("请输入一个int数字：");
            String input = sc.nextLine();
            try {
                num = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("输入不合法，请重新输入！");
                continue;
            }
            System.out.println("你输入的是：" + num + "!!");
            break;
        }
    }
}
