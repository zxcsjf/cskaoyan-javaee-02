package com._16_string.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zxcsjf
 * @since 2022/06/21 21:08
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.hashCode());

        Date date2 = new Date(Long.MAX_VALUE);
        System.out.println(date2);
        System.out.println(Long.MAX_VALUE / 365 /24/60/60/1000);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));

        int year = 2022;
        double num = 3.1415;

        // 直接输数字
        System.out.format("%d%n",year);

        // 总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        // 左对齐
        System.out.format("%-8d%n",year);
        // 总长度为8,不够补0
        System.out.format("%08d%n",year);
        System.out.println(num);

        //小数点后几位
        System.out.format("%.2f%n",num);
    }
}
