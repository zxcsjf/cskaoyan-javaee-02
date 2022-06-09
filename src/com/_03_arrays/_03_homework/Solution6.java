package com._03_arrays._03_homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组基本使用练习
 * 1. 定义一个double数组用来存放学生成绩，
 * 然后键盘录入10位同学的成绩并存入数组，
 * 求这10位同学成绩的平均值。
 * <p>
 * 2.
 * 定义一个String数组，输出该数组的长度，
 * 并用多种方式遍历打印数组元素（常见的方式遍历即可）
 * <p>
 * 注：  请合理使用方法，不要胡子眉毛一把抓把代码全部写在main方法里。
 * 数组遍历的方式，比如for、增强for或者使用工具类等等。
 *
 * @author zxcsjf
 * @since 2022/06/09 19:24
 */
public class Solution6 {
    public static void main(String[] args) {
        double[] scores = new double[10];
        System.out.println("这10个学生的平均成绩是：" +  getMeanScore(getStudentScoreByScanner(scores)) +"分。");


        String[] strings = {"长风", "单纪飞", "丸子", "风华"};
        System.out.println("这个String数组的长度是：" + strings.length);

        // 普通for
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        System.out.println("\b\b]");

        // 增强for
        System.out.print("[");
        for (String string : strings) {
            System.out.print(string + ", ");
        }
        System.out.println("\b\b]");

        // Array.toString()
        System.out.println(Arrays.toString(strings));
    }

    private static double[] getStudentScoreByScanner(double[] scores) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请依次输入10个学生的成绩：");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }

    private static double getMeanScore(double[] scores) {
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
        }
        return sum / 10;
    }
}
