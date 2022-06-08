package _02_homework;

/**打印倒三角形，并且行数（line）是可控制的。比如我想打印6行的倒三角形，则如下图：
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 *
 *
 * @author zxcsjf
 * @since 2022/06/07 19:05
 */
public class Solution6_02 {
    public static void main(String[] args) {
        printTriangle(6);
    }

    private static void printTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
