package com._03_arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 可变参数
 *
 * @author zxcsjf
 * @since 2022/06/10 10:04
 */
public class VariableParameterDemo {
    public static void main(String[] args) {

        System.out.println(sum(1, 23, 4));
    }

    private static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
