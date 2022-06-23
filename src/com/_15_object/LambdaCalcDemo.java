package com._15_object;

/**
 * @author zxcsjf
 * @since 2022/06/20 20:49
 */

public class LambdaCalcDemo {
    public static void main(String[] args) {
        System.out.println(calc((num1, num2) -> num1 + num2, 10, 10));
        System.out.println(calc((num1, num2) -> num1 * num2, 10, 10));
        System.out.println(calc((num1, num2) -> num1 / num2, 10, 10));
        System.out.println(calc((num1, num2) -> num1 - num2, 10, 10));
    }

    public static double calc(Compute com, double num1, double num2) {
        return com.compute(num1, num2);
    }

}

@FunctionalInterface
interface Compute {
    double compute(double a, double b);
}
