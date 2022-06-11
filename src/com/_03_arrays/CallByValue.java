package com._03_arrays;

import java.util.Arrays;

/**
 * 值传递
 *
 * @author zxcsjf
 * @since 2022/06/10 10:18
 */
public class CallByValue {

    public static void main(String[] args) {
        int a = 10;
        doubleIntValue(a);
        System.out.println(a);
        System.out.println();

        int[] arr = {1, 2, 3};
        doubleIntArrElement(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void doubleIntValue(int num) {
        num *= 2;
    }

    private static void doubleIntArrElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
