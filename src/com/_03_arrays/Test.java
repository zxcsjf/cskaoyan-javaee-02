package com._03_arrays;

import java.util.Scanner;

/**
 * test
 *
 * @author zxcsjf
 * @since 2022/06/08 10:32
 */
public class Test {

    @org.junit.Test
    public void test1() {
        System.out.println("input a num: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    private static void test2(int num) {
        System.out.println(num);
    }
}


