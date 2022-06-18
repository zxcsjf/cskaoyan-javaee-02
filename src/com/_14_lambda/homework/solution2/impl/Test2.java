package com._14_lambda.homework.solution2.impl;

import com._14_lambda.homework.solution2.ICompute;

/**
 * 2. 局部内部类测试
 *      实现IComputer
 *       有两种：
 *           1. 静态成员方法
 *           2. 成员方法的局部位置
 *
 * @author zxcsjf
 * @since 2022/06/18 14:54
 */
public class Test2 {

    public static void main(String[] args) {
        Test2.staticMemberMethod();
        new Test2().memberMethod();
    }

    public static void staticMemberMethod() {
        // 1. 静态成员方法的局部位置
        class staticComputeLocalImpl implements ICompute {

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
        staticComputeLocalImpl scli = new staticComputeLocalImpl();
        System.out.println(scli.add(1, 2));
    }
    public void memberMethod() {
        // 2.外围类，成员方法的局部位置
        class computeLocalImpl implements ICompute {

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
        computeLocalImpl cli = new computeLocalImpl();
        System.out.println(cli.multiply(2, 3));
    }
}
