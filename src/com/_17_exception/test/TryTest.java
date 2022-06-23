package com._17_exception.test;

/**
 * @author zxcsjf
 * @since 2022/06/22 11:27
 */
public class TryTest {
    public static void main(String[] args) {
        // method();
        // try {
        //     System.out.println("before");
        //     System.out.println(10/0);
        //     System.out.println("after");
        // }
        // catch (RuntimeException e){
        //     System.out.println("发生了异常");
        // }
        // System.out.println("try..catch之后");

        // System.out.println("开始测试如果try中的异常不能正常捕获,但是finally中有return");
        try {
            System.out.println("before");
            System.out.println(10/0);
            System.out.println("after");
            return;
        }
        catch (NullPointerException e){
            System.out.println("发生了异常");
        }
        finally {
            System.out.println("finally block!");
            // return ;
        }
        // System.out.println("try..catch之后");

        // try {
        //     System.out.println("before");
        //     System.out.println(10/10);
        //     System.out.println("after");
        // }
        // catch (NullPointerException e){
        //     System.out.println("发生了异常");
        // }
        // System.out.println("try..catch之后");

        // method();
    }

    // private static int method() {
    //     try {
    //         System.out.println(10 / 0);
    //         // return method() ;
    //     } catch (NullPointerException e) {
    //         e.printStackTrace();
    //         // return;
    //         // System.exit(0);
    //     } finally {
    //         System.out.println("finally");
    //         // return 1 / 0;
    //     }
    // }
}
