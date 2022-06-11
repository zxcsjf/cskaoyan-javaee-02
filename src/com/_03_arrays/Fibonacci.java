package com._03_arrays;

/**
 * @author zxcsjf
 * @since 2022/06/10 12:58
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n <= 0)
            return n;
        int[] Memo = new int[n + 1];
        Memo[0] = 0;
        Memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            Memo[i] = Memo[i - 1] + Memo[i - 2];
        }
        return Memo[n];
    }


}
