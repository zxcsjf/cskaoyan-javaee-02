package com._03_arrays._03_homework;

import java.util.Arrays;

/**
 * 数组基础练习——除以首元素 定义一个double类型的数组，
 * 让数组中每个元素（包括首位元素）都除以首位元素，得到的结果过作为该位置上的新元素。
 * 请在原先数组数组上操作，并打印新数组。
 *
 * 例如数组[ 2.0 , 4.0 , 6.0 , 4.0 ] 经过方法运算得到新数组 [ 1.0 ,2.0 , 3.0 ,2.0 ]
 * 注：注意元素取值的变化。
 *
 * @author zxcsjf
 * @since 2022/06/09 19:08
 */
public class Solution4 {
    public static void main(String[] args) {
        double[] nums = {2.0, 4.0, 6.0, 4.0};
        double num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / num;
        }

        System.out.println(Arrays.toString(nums));
    }
}
