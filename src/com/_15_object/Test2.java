package com._15_object;

import java.util.stream.IntStream;

/**
 * @author zxcsjf
 * @since 2022/06/20 21:35
 */
public class Test2 {
    static int start = Integer.MAX_VALUE;
    static int end = start - 5;

    public static void main(String[] args) {
        // int count = 0;
        // for (int i = 0; i < start; i++) {
        //     count++;
        //     System.out.println(count);
        // }
        // char a = 'a';
        // System.out.println(a);


        ThreadLocal<String> local = new ThreadLocal<>();

        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            local.set(Thread.currentThread().getName() + ":" + i);
            System.out.println("线程：" + Thread.currentThread().getName() + ",local:" + local.get());
        }).start());
    }
}
