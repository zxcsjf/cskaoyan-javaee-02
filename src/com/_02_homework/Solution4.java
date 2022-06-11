package com._02_homework;

import com._03_arrays.Test;

import java.util.Scanner;

/**
 * Scanner基础使用练习
 * 键盘输入某个学生的三门学科（数学，语文，英语）成绩，然后分别求出三科成绩的平均分，最低分，最高分，三科的总分。
 * <p>
 * 注：
 * <p>
 * 代码直接写在main()方法中即可，注意命名规范！
 * <p>
 * 注意录入数据的数据类型。
 *
 * @author zxcsjf
 * @since 2022/06/07 18:42
 */
public class Solution4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请依次输入数学成绩：");
        double mathScore = scanner.nextDouble();
        System.out.print("请依次输入语文成绩：");
        double chineseScore = scanner.nextDouble();
        System.out.print("请依次输入英语成绩：");
        double englishScore = scanner.nextDouble();

        double totalScore = mathScore + chineseScore + englishScore;

        double meanScore = totalScore / 3;

        double minScore = mathScore;
        if (chineseScore < mathScore) {
            minScore = chineseScore;
        }
        if (englishScore < mathScore) {
            minScore = englishScore;
        }

        double maxScore = mathScore;
        if (chineseScore > mathScore) {
            maxScore = chineseScore;
        }
        if (englishScore > mathScore) {
            maxScore = englishScore;
        }

        System.out.println("平均分是：" + meanScore);
        System.out.println("最低分是：" + minScore);
        System.out.println("最高分是：" + maxScore);
        System.out.println("总分是：" + totalScore);
    }
}
