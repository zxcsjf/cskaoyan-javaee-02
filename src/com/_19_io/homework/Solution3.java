package com._19_io.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 读取一个文件，这个文件中有随机的一些数字字符，统计这些数字有几个偶数，几个奇数，并且追加写入到该文件末尾。
 * 例如：a.txt文件内容为
 * 3241256364789629090126581212515
 * 奇数：xx个
 * 偶数：xx个
 *
 * @author zxcsjf
 * @since 2022/06/24 20:13
 */
public class Solution3 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        // 奇数计数器
        int oddCount = 0;
        int evenCount = 0;
        // 记录读到的单个int数字
        int readData = 0;
        while (true) {
            readData = fileInputStream.read();
            if (readData == -1) {
                break;
            }
            if (readData % 2 == 0) {
                evenCount++;
                continue;
            }
            // 运行到这里，一定是奇数
            oddCount++;
        }
        fileInputStream.close();

        // 创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        String str = "统计:这些数字有" + evenCount + "个偶数，" + oddCount + "个奇数.";
        fileOutputStream.write(System.lineSeparator().getBytes());
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }
}
