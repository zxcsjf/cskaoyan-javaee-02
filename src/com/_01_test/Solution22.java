package com._01_test;

import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * 键盘录入某个人的工资收入，求他应该缴纳的个人所得税以及最后得到的工资。
 * 也就是说根据税前工资，求两个值：
 * 缴纳的个税  到手工资  个人所得税的计算方法是：
 * 应纳税额 = 应纳税所得额 * 税率 - 速算扣除数 （速算扣除额已经扣除了重复计算的部分）
 * 其中，应纳税所得额 = 工资薪金所得-2000（即工资超过2000的部分才需要缴税）
 * 针对不同的收入人群，需要缴纳个税的税率是不同的，详参下列表格：
 *
 * @author zxcsjf
 * @since 2022/06/06 20:31
 */
public class Solution22 {
    public static void main(String[] args) {
        System.out.print("输入工资：");
        Scanner scanner22 = new Scanner(System.in);
        int salary = scanner22.nextInt();
        int taxableIncome = salary - 2_000;
        System.out.println("应纳税额：" + getTax(taxableIncome));

    }

    private static double getTax(int taxableIncome) {
        // 配合return 减少写else
        if (taxableIncome < 0) {
            return 0;
        }
        if (taxableIncome <= 500) {
            return taxableIncome * 0.05;
        }
        if (taxableIncome <= 2_000) {
            return taxableIncome * 0.10 - 25;
        }
        if (taxableIncome <= 5_000) {
            return taxableIncome * 0.15 - 125;
        }
        if (taxableIncome <= 20_000) {
            return taxableIncome * 0.20 - 375;
        }
        if (taxableIncome <= 40_000) {
            return taxableIncome * 0.25 - 1375;
        }
        if (taxableIncome <= 60_000) {
            return taxableIncome * 0.30 - 3375;
        }
        if (taxableIncome <= 80_000) {
            return taxableIncome * 0.35 - 6375;
        }
        if (taxableIncome <= 100_000) {
            return taxableIncome * 0.40 - 10375;
        }
        return taxableIncome * 0.45 - 15375;

    }
}

