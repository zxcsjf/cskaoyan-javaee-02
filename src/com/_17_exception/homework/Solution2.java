package com._17_exception.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zxcsjf
 * @since 2022/06/22 16:18
 */
public class Solution2 {
    public static void main(String[] args) throws ParseException {
        DateUtil.calc();
    }
}

class DateUtil {
    public static void calc() throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateNow = new Date();
        Date birthay = sdf.parse("1999-09-20");
        long days = (dateNow.getTime() - birthay.getTime()) / (24 * 3600 * 1000);
        System.out.println("你已经活了" + days + "天！！");

    }
}