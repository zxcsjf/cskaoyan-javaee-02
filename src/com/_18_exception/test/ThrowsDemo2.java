package com._18_exception.test;

/**
 * @author zxcsjf
 * @since 2022/06/23 10:00
 */


public class ThrowsDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Son son = new Son();
        // Father father = new Father();
        //
        // // ArithmeticException arithmeticException = new ArithmeticException("除以0");
        // // System.out.println(arithmeticException.getMessage());
        // son.testRuntime();
        // // son.testCheckable();
        System.out.println(1 / 0);


    }
}
//
// class Father extends Throwable {
//
//     public void testRuntime() {
//     }
//
//     public void testCheckable() throws CloneNotSupportedException {
//     }
//
// }
//
// class Son extends Father {
//
//     @Override
//     public void testRuntime() throws ArithmeticException {
//         System.out.println(1 / 0);
//         // int[] nums = {};
//         // for (int i = 0; i <= nums.length; i++) {
//         //     System.out.println(nums[i]);
//         // }
//     }
//
//     @Override
//     public void testCheckable() throws CloneNotSupportedException {
//         clone();
//     }
// }
