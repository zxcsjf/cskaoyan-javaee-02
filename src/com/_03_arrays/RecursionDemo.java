package com._03_arrays;

import java.lang.reflect.Field;

/**
 * 递归
 *
 * @author zxcsjf
 * @since 2022/06/10 11:23
 */
public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(factorLoopSolution(10));
        System.out.println(factorRecursionSolution(10));
        Integer x = 1;
        Class<? extends Integer> xClass = x.getClass();
        try {
            Field min_value = xClass.getDeclaredField("MIN_VALUE");
            System.out.println(min_value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    private static long factorRecursionSolution(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorRecursionSolution(n - 1);
    }

    private static long factorLoopSolution(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }


}
