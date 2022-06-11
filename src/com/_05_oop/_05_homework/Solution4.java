package com._05_oop._05_homework;

import java.util.Arrays;

/**
 * 数组综合练习——删除元素 对于某个String类型数组，将其中的某个元素全部去掉，得到一个新数组，并统计去掉了几个元素。
 * <p>
 * 举例，对于String数组["abc", "123", "123", "123", "666", "777"]
 * 将其中的元素"123"全部去掉，就得到了新数组["abc","666", "777"]，
 * 一共去掉了3个元素。
 * <p>
 * 注：  这里说的去掉，不是指用0/null等默认值替代原先的元素，而是指真正的删除掉。
 * <p>
 * 思考：同一个数组能不能实现这个功能？如果不能，应该怎么完成呢？
 * <p>
 * String如何判断内容相同？ 该题有一定难度，建议不行放最后做。
 *
 * @author zxcsjf
 * @since 2022/06/10 19:27
 */
public class Solution4 {
    public static void main(String[] args) {
        String[] strings = {"abc", "123", "123", "123", "666", "777"};
        System.out.println(Arrays.toString(deleteAndReturn(strings, "123")));
    }

    private static String[] deleteAndReturn(String[] oddStrings, String delete) {
        int deleteCount = 0;
        for (String string : oddStrings) {
            if (delete.equals(string)) {
                deleteCount++;
            }
        }
        System.out.println("一共去掉了" + deleteCount + "个元素。");
        String[] newStrings = new String[oddStrings.length - deleteCount];
        int newIndex = 0;
        for (String string : oddStrings) {
            if (delete.equals(string)) continue;
            newStrings[newIndex] = string;
            newIndex++;
        }

        return newStrings;
    }
}
