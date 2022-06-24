package com._19_io.charstream._06_simplestream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zxcsjf
 * @since 2022/06/24 16:27
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a.txt");
        fileWriter.write("简化流！");
    }
}
