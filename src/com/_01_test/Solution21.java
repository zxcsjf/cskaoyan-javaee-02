package com._01_test;

import java.util.Scanner;

/**
 * 键盘录入一个月份，然后根据月份输出对应季节：  12、1、2：冬季 3、4、5：春季  6、7、9：夏季  9、10、11：秋季 比如键盘输入1，控制台就会输出冬季这两个字。  请合理利用已学的知识，注意代码规范。
 *
 * @author zxcsjf
 * @since 2022/06/06 21:27
 */
public class Solution21 {
    public static void main(String[] args) {


        System.out.print("请输入一个月份：");
        Scanner scanner21 = new Scanner(System.in);
        int input = scanner21.nextInt();

        int num = input / 3 % 4;
        switch (num) {
            case 0:
                System.out.println("冬季");
                break;

            case 1:
                System.out.println("春季");
                break;

            case 2:
                System.out.println("夏季");
                break;

            default:
                System.out.println("秋季");
                break;

        }
    }
}
