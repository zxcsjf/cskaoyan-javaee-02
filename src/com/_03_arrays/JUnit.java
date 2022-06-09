package com._03_arrays;

/**
 * @author zxcsjf
 * @since 2022/06/08 17:01
 */
public class JUnit {
    public static void main(String[] args) {

        Class c3 = com._03_arrays.Test.class;
        Class c4 = int[].class;
        Class c5 = void.class;

        System.out.println(c3.getCanonicalName());// int
        System.out.println(c4.getCanonicalName());// int[]
        System.out.println(c5.getCanonicalName());// void
    }

}
