package com._03_arrays._03_homework;

/**
 * 汉诺塔
 *
 * @author zxcsjf
 * @since 2022/06/10 14:45
 */
public class Hanoi {

    public static void main(String[] args) {
        try {
            System.out.println(hanoi(36));
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //求解汉诺塔问题
    public static long hanoi(int n) {
        //写递归的出口
        if (n == 1) {
            return 1;
        }
        return hanoi(n - 1) + 1 + hanoi(n - 1);
    }
}
