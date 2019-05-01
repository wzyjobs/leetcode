package com.ericgarvin.leetcode.easy.array;

import java.util.Arrays;

/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int flag = (digits[digits.length - 1] + 1) / 10;
        digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
        for (int index = digits.length - 2; index >= 0; index--) {
            int sloveNum = digits[index] + flag;
            flag = sloveNum / 10;
            digits[index] = sloveNum % 10;
        }
        if (flag > 0) {
            int[] result = new int[digits.length + 1];
            for (int endBack = digits.length; endBack > 0; endBack--) {
                result[endBack] = digits[endBack - 1];
            }
            result[0] = 1;
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne_66().plusOne(new int[]{8, 9, 9, 9})));
    }
}
