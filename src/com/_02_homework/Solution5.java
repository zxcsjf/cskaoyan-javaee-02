package com._02_homework;

import java.util.Scanner;

/**
 * Scanner基础使用练习 使用Scanner依次接收以下三种数据类型的值：  int类型  String类型  double类型
 * 接收三个值后，
 * 再计算：  求和：int + double
 * 拼接字符串：int + double + String
 * 分别接收计算结果后，输出该计算结果。
 * 注
 * ：  使用Scanner时，注意不要混用next系列和nextLine方法。
 * （原因可以查看详细文档说明）
 * 代码直接全部写在main方法中即可。
 *
 * @author zxcsjf
 * @since 2022/06/07 18:57
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("请输入一个int：");
        int num1 = scanner1.nextInt();
        System.out.print("请输入一个String：");
        String str1 = scanner2.nextLine();
        System.out.print("请输入一个double：");
        double num2 = scanner1.nextDouble();

        double sum = num1 + num2;
        String strResult = num1 + num2 + str1;

        System.out.println(sum);
        System.out.println(strResult);

    }
}
