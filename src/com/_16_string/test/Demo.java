package com._16_string.test;

import com._14_lambda.homework.solution2.impl.Test3;

/**
 * @author zxcsjf
 * @since 2022/06/21 10:07
 */
public class Demo {
    public static void main(String[] args) {
        // Boolean aBoolean = new Boolean(true);
        String s1 = new String("hello");
        String s0 = "hello";
        System.out.println("下面开始Test类加载");
       new Test();

    }
}

class Test {
    static {
        System.out.println("Test类加载了！！");
    }
    // static String s1 = "hello world!";
   static String s2 = "hello world!";
   static String s3 = "hello " + s2;
   String s4 = "hello world!";
   String s5 = "hello world5";

   static {
       System.out.println(s2 == s3);
   }

}
