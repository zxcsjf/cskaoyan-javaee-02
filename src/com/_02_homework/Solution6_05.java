package _02_homework;

/** * 根据键盘录入打印n行m列井号，n和m是可变的。
 *
 * @author zxcsjf
 * @since 2022/06/07 19:05
 */
public class Solution6_05 {
    public static void main(String[] args) {
        printNumberSign(5, 3);
    }

    private static void printNumberSign(int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
