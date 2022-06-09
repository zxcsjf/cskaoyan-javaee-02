package com._03_arrays._03_homework;

/**
 * 数组基本使用练习 现在你去参加歌唱比赛。
 * 有10个评委打分，规则是去掉最高分和最低分，求平均分是最终成绩。
 * <p>
 * 请编码计算出你的最终成绩~
 * 注：  请合理使用方法，不要胡子眉毛一把抓把代码全部写在main方法里。
 * <p>
 * 最高分和最低分可能有多个，但只需要去掉其中一个即可（也就是说平均成绩要除以8）
 * <p>
 * 建议给出下面的三个方法：  求数组中元素最大值的方法  求数组中元素最小值的方法  求数组中元素平均分的方法
 *
 * @author zxcsjf
 * @since 2022/06/09 19:11
 */
public class Solution5 {
    public static void main(String[] args) {
        double[] scores = {100.0, 99.0, 90.0, 88.0, 77.0, 80.0, 90.0, 95.0, 98.0, 75.0};

        System.out.println("你的最终成绩是：" + getMeanScore(scores) + "分。");
    }

    private static double getMeanScore(double[] scores) {
        double sum = 0.0;
        for (double score : scores) {
            sum += score;
        }
        sum = sum - getMinScore(scores) - getMaxScore(scores);
        return sum / 8;
    }

    private static double getMinScore(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            min = min < score ? min : score;
        }
        return min;
    }

    private static double getMaxScore(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            max = max > score ? max : score;
        }
        return max;
    }
}
