package com._17_exception.homework;

import java.util.Random;

/**
 * @author zxcsjf
 * @since 2022/06/22 17:33
 */
public class Ex5 {
    public static void main(String[] args) {
        //生成100个2位字符串的字符串数组
        String[] strArr = new String[10000];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = getRandomStr(2);
        }
        //调用方法完成计数
        long startTime = System.nanoTime();
        countRepeatCharacter(strArr);
        long consumingTime = System.nanoTime() - startTime;
        System.out.println("操作消耗时间：" + consumingTime + "纳秒");

    }

    private static void countRepeatCharacter(String[] s) {
        //创建Count对象并初始化
        Count[] c = new Count[s.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Count(" ", 0);
        }
        //realLength存储到目前位置不重复的字符数量，也就是存过字符的c的数量
        int realLength = 0;
        //如果重复，则count++，如果不重复，在末尾加上它，并让总长度加一
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j <= realLength; j++) {
                if (s[i].equals(c[j].str)) c[j].count++;
            }
            c[realLength].str = s[i];
            realLength++;
        }
        //打印重复字符串和重复次数
        for (int index = 0; index < c.length; index++) {
            if (c[index].count > 0)
                System.out.println(c[index].str + "发生了重复，重复了" + (c[index].count + 1) + "次");
        }
    }

    //生成仅由数字和字母组成的字符串
    private static String getRandomStr(int len) {
        String pool = "";
        for (int i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (int i = 'A'; i < 'Z'; i++)
            pool += (char) i;
        for (int i = 'a'; i < 'z'; i++)
            pool += (char) i;
        char[] chars = new char[len];
        // 填充字符数组
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            int index = random.nextInt(pool.length());
            chars[i] = pool.charAt(index);
        }
        return new String(chars);
    }
}

//用于计数的类，类似于结构体，str存储这里的字符串，count存储这个字符重复次数
class Count {
    String str = " ";
    int count = 0;

    public Count() {
    }

    public Count(String str, int count) {
        this.str = str;
        this.count = count;
    }
}