package com._03_arrays;



/**
 * @author zxcsjf
 * @since 2022/06/08 16:51
 */
public class Demo2 {
    public static int[] getResult(int i) {
        int[] res = new int[]{};
        if (i > 0) {
            res = new int[] {1, 2};
        }
        if (i < 0) {
            res = new int[] {1};
        }
        return res;
    }


    public static void main(String[] args) {

        // System.out.println(Arrays.toString(getResult(0)));
        // // 声明
        // char[] chars = new char[2]; // 初始化
        // System.out.println(chars[1]);
        //
        //
        // int[] arr1 = {1, 2, 3};
        // for (int i : arr1) {
        //
        // }

        // StringBuffer stringBuffer = new StringBuffer("[");
        // for (int i = 0; i < arr1.length; i++) {
        //     stringBuffer.append(arr1[i] + ", ");
        // }
        //
        // System.out.println(stringBuffer.substring(0, stringBuffer.length() - 2) + "]");


        // // 输出[1, 2, 3]
        // if (arr1 != null && arr1.length != 0) {
        //     System.out.print("[");
        //     for (int i = 0; i < arr1.length; i++) {
        //         System.out.print(arr1[i] + ", ");
        //     }
        //     System.out.println("\b\b]");
        //
        // }
        //
        //
        //
        // String[] strings = {"1", "2"};
        // String str1 = "a";
        // String str2 = new String("s");
        //
        // System.out.println(str2==str1);


        // Scanner scanner = new Scanner(System.in);
        // String s = scanner.nextLine();
        // System.out.println(s);
        // // System.out.println("\u0000".equals(null));
        // System.out.println("\u0000".equals(""));
        // System.out.println("\u0000".length());
        // System.out.println("".length());
        //
        // char[] chars = new char[2];
        // System.out.println(chars[0]);


//         int [] array1 = {1, 2};
//         int [] array2 = new int []{1, 2};
//         System.out.println("hello world");
//         int a =  10;
//         int b  = 20;
//         int c;
//         c = a + b;
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num > 0) {
//             System.out.println("你输入的数大于0");
//         } else if (num == 0) {
//             System.out.println("你输入的数等于0");
//         } else {
//             System.out.println("你输入的数小于0");
//         }
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//         method();
//     }
//     public static void method() {
//         System.out.println("test");
//         System.out.println("test");
//         System.out.println("test");
//         System.out.println("test");
    }
}
