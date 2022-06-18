package com._14_lambda.homework.solution2.impl;

import com._14_lambda.homework.solution2.ICompute;

/**
 * 1. 实现类测试
 * @author zxcsjf
 * @since 2022/06/18 14:53
 */
public class Test1 implements ICompute {
    public static void main(String[] args) {
        System.out.println(new Test1().add(1, 2));

    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double minuend, double subtraction) {
        return minuend - subtraction;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }
}
