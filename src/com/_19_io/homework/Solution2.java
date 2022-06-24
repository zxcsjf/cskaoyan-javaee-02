package com._19_io.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 定义一个这样的一个words数组，数组中每个字符串的格式为“词性:单词”
 * String[] words = {"verb:eat","verb:drink","verb:sleep","verb:play","noun:rice","noun:meat","noun:hand","noun:hair"};
 * 要求:
 * 根据单词性质动词verb全部存入verb.txt文件中
 * 根据单词性质名词noun全部存入noun.txt文件中
 *
 * @author zxcsjf
 * @since 2022/06/24 20:01
 */
public class Solution2 {
    public static void main(String[] args) throws IOException {
        String[] words = {"verb:eat", "verb:drink", "verb:sleep", "verb:play", "noun:rice", "noun:meat", "noun:hand", "noun:hair"};
        File verbfile = new File("verb.txt");
        File nounfile = new File("noun.txt");
        FileOutputStream verbOut = new FileOutputStream(verbfile);
        FileOutputStream nounOut = new FileOutputStream(nounfile);
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("verb:")) {
                verbOut.write(words[i].getBytes());
                verbOut.write(System.lineSeparator().getBytes());
            }
            if (words[i].startsWith("noun:")) {
                nounOut.write(words[i].getBytes());
                nounOut.write(System.lineSeparator().getBytes());
            }
        }
        verbOut.close();
        nounOut.close();
    }
}
