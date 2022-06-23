package com._17_exception.homework;

import java.util.Date;
import java.util.Random;

/**
 * 创建一个长度是100的字符串数组 使用长度是2的随机字符填充该字符串数组 统计这个字符串数组里重复的字符串有多少种(忽略大小写)
 * 例如 输出: 20个字符串一行 共5行
 * 01 0S 1M 1q 20 2R 2S 3d 3k 3x 43 4A 4R 5T 7C 7U 7e 7k 80 88 8p AD AG AY BF BO Db E2
 * Eg El GF Gm HC HO IB If J0 JY Jv KW L0 LT MA NL NL NU PY Qx Rr Ry SB So TH Tu UR VD
 * WR Xe Xw Xx Y3 YL Yd Yk a3 aL bW bq cI cv cv dg eL fL gA gL gh h4 hm j7 jp kN m1 mS
 * o6 pQ qV rP rf s7 sA um vE vP vb w6 wB xP yK yQ
 * El发生了重复 重复了2次
 * NL发生了重复 重复了2次
 * Yk发生了重复 重复了2次
 * cv发生了重复 重复了2次
 *
 * @author zxcsjf
 * @since 2022/06/22 17:01
 */
public class Solution5 {
    public static void main(String[] args) {
        //
        String[] strings = new String[2];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = getRandomString(2);
        }

        for (int i = 0; i < strings.length; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.print(strings[i] + "\t");
        }
        System.out.println();

        long startTime = System.nanoTime();
        countRepeatString(strings);
        long consumingTime = System.nanoTime() - startTime;
        System.out.println("操作消耗时间：" + consumingTime + "纳秒");
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

    // 统计重复的字符串对象和个数
    // count duplicate string
    public static void countRepeatString(String[] input) {
        // counts数组，记录重复次数，＜2不记录
        // 等于0,说明不重复
        // 等于-1，说明已经记录过
        int[] counts = new int[input.length];
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (counts[j] != -1 && input[i].compareToIgnoreCase(input[j]) == 0) {
                    counts[i]++;
                    counts[j] = -1;
                }
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (counts[i] >= 2) {
                System.out.println("字符串" + input[i] + "重复了" + counts[i] + "次！");
            }
        }
    }

}
