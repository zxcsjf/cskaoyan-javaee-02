package com._16_string.test;

import java.nio.charset.Charset;

/**
 * @author zxcsjf
 * @since 2022/06/21 23:09
 */
public class CharTest {
    public static void main(String[] args) {
        String str = new String(new byte[]{(byte) 0XD5, (byte) 0xc5}, Charset.forName("gbk"));
        // String str = new String(new byte[]{(byte) 213, (byte) 197}, Charset.forName("gbk"));
        System.out.println(str);

        String str2 = new String(new byte[]{(byte) 0xE5, (byte) 0xBC, (byte) 0xA0}, Charset.forName("utf-8"));
        System.out.println(str2);

        String str3 = new String(new int[]{0x1F6b4}, 0, 1);
        System.out.println(str3);
    }
}
