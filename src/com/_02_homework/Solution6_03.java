package _02_homework;

/**根据键盘录入打印nn乘法表，n是可变的。
 *
 *
 * @author zxcsjf
 * @since 2022/06/07 19:05
 */
public class Solution6_03 {
    public static void main(String[] args) {
        printMultiplicationTable(6);
    }

    private static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
