package com.ericgarvin.leetcode.easy;

/**
 * 9.回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        String reverStr = stringBuffer.toString();
        return reverStr.equals(s) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber_9().isPalindrome(2147483647));
    }
}
