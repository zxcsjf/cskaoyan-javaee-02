package com._19_io.charstream._02_encode;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @author zxcsjf
 * @since 2022/06/24 14:44
 */
public class DemoCharset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 明文
        String str = "你";
        System.out.println("默认字符集是：" + Charset.defaultCharset());
        System.out.println("明文是：" + str);

        // 1. 使用默认字符集编码成byte数组
        byte[] bytes = str.getBytes();
        System.out.println("使用默认字符集编码成byte数组：" + Arrays.toString(bytes));
        String encode = new String(bytes);
        System.out.println("使用默认字符集解码后：" + encode);

        // 2. 使用“GBK”字符集编码，一个汉字两个字节
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println("使用GBK字符集编码成byte数组：" + Arrays.toString(bytes2));

        // 解码过程
        String encode2 = new String(bytes2, "gbk");
        System.out.println("使用GBK字符集解码后：" + encode2);

    }
}
