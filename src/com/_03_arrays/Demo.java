package com._03_arrays;

import java.util.Arrays;

/**
 * @author zxcsjf
 * @since 2022/06/08 11:40
 */
public class Demo {
    public static void main(String[] args) {
        int [] smallPrimers;
        smallPrimers = new int[]{2, 3, 5, 7};
        int [] luckyNumbers = Arrays.copyOf(smallPrimers, 10);
        for (int n : luckyNumbers) {
            System.out.println(n);
        }
    }
}
