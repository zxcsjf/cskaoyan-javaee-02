package com._16_string.homework;

import java.util.Date;
import java.util.Random;

/**
 * (选做)穷举匹配密码
 * <p>
 * 生成一个长度是3的随机数字字符串，把这个字符串数字当做密码
 * 使用穷举法生成长度是3的字符串(000,001,002...999)，匹配上述生成的密码,将列举到的可能的密码打印,直到匹配成功结束.
 *
 * @author zxcsjf
 * @since 2022/06/21 20:35
 */
public class Solution7 {
    public static void main(String[] args) {

        // sb 存储长度是3的随机数字字符串
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        String realPassword = "999";

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    StringBuffer testsb = new StringBuffer();
                    testsb.append(i);
                    testsb.append(j);
                    testsb.append(k);
                    String testPassword = testsb.toString();
                    System.out.println("testPassword = " + testPassword);
                    if (testPassword.equals(realPassword)) {
                        System.out.println("猜对了！密码就是" + realPassword);
                        long end = System.currentTimeMillis();
                        System.out.println(end - start + "ms");
                        return;
                    }
                    System.out.println("猜错了！密码不是" + testPassword);
                }
            }
        }
    }
}
