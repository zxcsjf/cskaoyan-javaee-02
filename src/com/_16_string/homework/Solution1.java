package com._16_string.homework;

import java.util.Arrays;

/**
 * @author zxcsjf
 * @since 2022/06/21 18:51
 */
public class Solution1 {
    public static void main(String[] args) {
        String str = "Hello World!01";
        // String的API , 自己练习一下,敲一敲.
        //
        // 判断功能
        // 用来比较字符串的内容，注意区分大小写
        // boolean equals(Object obj)
        //
        // 忽略字符串大小写比较字符串内容，常见用于比较网址URL
        // boolean equalsIgnoreCase(String str)
        //
        // 判断当前字符串对象是否包含，目标字符串的字符序列
        // boolean contains(String str)
        //
        // 判断当前字符串对象，是否已目标字符串的字符序列开头
        // boolean startsWith(String str)
        //
        // 判断当前字符串，是否以目标字符串对象的字符序列结尾，常用于确定文件后缀名格式
        // boolean endsWith(String str)
        //
        // 判断一个字符串，是不是空字符串 "" null
        // boolean isEmpty()
        //
        // 获取功能
        // 获取当前字符串对象中，包含的字符个数
        // int length()
        //
        // 获取字符串对象代表字符序列中，指定位置的字符
        // char charAt(int index)
        System.out.println(str.charAt(7));
        // 在当前字符串对象中查找指定的字符，如果找到就返回字符，首次出现的位置，如果没找到返回-1
        // 也可以填字符
        // int indexOf(int ch)
        System.out.println(str.indexOf('o'));
        //
        // 指定从当前字符串对象的指定位置开始，查找首次出现的指定字符的位置，(如果没找到返回-1)
        // 可以填入字符
        // int indexOf(int ch,int fromIndex)
        System.out.println(str.indexOf('o', 5));
        // 查找当前字符串中，目标字符串首次出现的位置(如果包含)，找不到，返回-1
        // 这里的位置是指目标字符串的第一个字符,在当前字符串对象中的位置
        // int indexOf(String str)
        System.out.println(str.indexOf("lo"));
        // 指定，从当前字符串对象的指定位置开始,查找首次出现的指定字符串的位置(如果没找到返回-1)
        // 这里的位置是指目标字符串的第一个字符,在当前字符串对象中的位置
        // int indexOf(String str,int fromIndex) ，
        System.out.println(str.indexOf("or", 4));
        // 返回字符串，该字符串只包含当前字符串中，从指定位置开始(包含指定位置字符)到结束的那部分字符串
        // String substring(int start)
        System.out.println(str.substring(3));
        // 返回字符串，只包含当前字符串中，从start位置开始(包含)，到end(不包含)指定的位置的字符串
        // String substring(int start,int end)
        System.out.println(str.substring(3, 7));
        //
        // 转换功能
        // 获取一个用来表示字符串对象字符序列的，字节数组
        // byte[] getBytes()
        System.out.println(Arrays.toString(str.getBytes()));
        // 获取的是用来表示字符串对象字符序列的，字符数组
        // char[] toCharArray()
        char[] chs = str.toCharArray();
        System.out.println(Arrays.toString(chs));

        // 把字符数组转换成字符串
        // static String valueOf(char[] chs)
        System.out.println(String.valueOf(chs, 0, 12));
        // 把各种基本数据类型和对象转换成字符串   1 →  "1"
        // static String valueOf(int i/double...)

        String str2 = String.valueOf(666);
        System.out.println(str2);
        // 把字符串全部转化为小写
        // String toLowerCase()
        System.out.println(str.toLowerCase());
        // 把字符串全部转换为大写
        // String toUpperCase()
        System.out.println(str.toUpperCase());
        // 字符串拼接，作用等价于 + 实现的字符串拼接
        // String concat(String str)
        String str3 = str + str2;
        System.out.println(str3);
        //
        // String类的替换功能
        // 在新的字符串中，用新(new)字符，替换旧(old)字符
        // String replace(char old,char new)
        System.out.println(str.replace('o', 'e'));
        // 在新的字符串中，用新的字符串(new), 替换旧(old)字符串
        // String replace(String old, String new)
        System.out.println(str.replace("ll", "xx"));
        // 截取功能
        // 返回一个新的String，开头到结束
        // public String substring(int start)
        System.out.println(str.substring(3));
        // 返回一个新的String，指定区间
        // public String substring(int start,int end)
        System.out.println(str.substring(3, 8));
        // 在新的字符串中，去掉开头和结尾的空格字符 " abc "
        // String trim()
        String str4 = " abc ";
        System.out.println(str4.trim());
        // 分隔功能
        // 将字符串按照符号分隔成字符串  "a,b,c,d"
        // String[] split(String re)
        String str5 = "a.b,c,d";
        System.out.println(Arrays.toString(str5.split(",")));
        // String类的比较功能
        // int compareTo(String str)
        // int compareToIgnoreCase(String str)
        System.out.println(str5.compareTo(str));
        System.out.println('a' - 'H');
    }
}
