package com._16_string.test;

/**
 * @author zxcsjf
 * @since 2022/06/21 21:57
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        for (int i = 0; i < 1000_00000; i++) {
            // sb.append('a');
            // str += 'a';
            stringBuilder.append("a");
        }
        // System.out.println(str);
        // System.out.println(sb.toString());
        System.out.println(stringBuilder.toString());
    }
}
