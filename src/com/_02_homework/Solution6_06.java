package _02_homework;

/**
 * * （扩展题）输出前n个数当中的所有素数，并统计个数。注：可以百度查一下如何求素数，该题作为扩展题，可以不做。
 *
 * @author zxcsjf
 * @since 2022/06/07 19:06
 */
public class Solution6_06 {
    public static void main(String[] args) {
        printPrimeNumber(8);
    }

    private static void printPrimeNumber(int n) {
        int count = 0;
        boolean signal;

        for (int i = 1; i <= n; i++) {
            signal = true;
            // 排除不是2的偶数、1
            if (i % 2 == 0 && i != 2 || i == 1)
                continue;

            // 只遍历到这个数的平方根，减少计算次数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    signal = false;
                    break;
                }
            }

            if (signal) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("1~" + n + "之间一共有" + count + "个素数。");
    }
}
