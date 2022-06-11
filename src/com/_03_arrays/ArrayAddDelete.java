package com._03_arrays;

import com.sun.org.apache.bcel.internal.generic.DLOAD;

import java.util.Arrays;

/**
 * 数组:增，删
 *
 * @author zxcsjf
 * @since 2022/06/10 09:41
 */
public class ArrayAddDelete {
    public static void main(String[] args) {
        int[] old = {1, 2, 3};
        System.out.println(Arrays.toString(realDeleteElementsIntArray(old, 1)));
    }

    // 1.删除某个元素，不唯一，要全部删除
    private static int[] realDeleteElementsIntArray(int[] old, int target) {
        // 1.求被删除元素的个数
        int delElementCount = 0;
        for (int ele : old) {
            if (ele == target) {
                delElementCount++;
            }
        }

        // 2.创建新数组
        int[] newArray = new int[old.length - delElementCount];

        // 3.返回新数组
        int newIndex = 0;
        for (int ele : old) {
            if (ele == target) {
                continue;
            }
            newArray[newIndex] = ele;
            newIndex++;
        }

        return newArray;

    }

}
