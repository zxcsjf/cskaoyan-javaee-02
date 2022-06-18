package com._14_lambda.homework.solution2.impl;

import com._14_lambda.homework.solution2.ICompute;

/**
 * 3. 匿名内部类测试
 *
 * @author zxcsjf
 * @since 2022/06/18 15:10
 */
public class Test3 {
    public static void main(String[] args) {
        Test3.staticMemberMethod();
        new Test3().memberMethod();
    }

    public static void staticMemberMethod() {
        // 1. 静态成员方法中，的局部位置，定义匿名内部类
        ICompute isci = new ICompute() {
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
        };
        // 只能在静态成员方法的方法体内部使用
        System.out.println(isci.subtract(100, 10));
    }

    public void memberMethod() {
        // 2. 成员方法中，的局部位置，定义匿名内部类
        // 不用父类接口引用接受，直接调用方法，
        System.out.println(new ICompute() {
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
        }.divide(13, 3));
    }
}
