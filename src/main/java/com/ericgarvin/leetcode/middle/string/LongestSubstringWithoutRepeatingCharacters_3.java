package com.ericgarvin.leetcode.middle.string;

import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int ans = 0;
        HashMap<Character, Integer> ci = new HashMap<>();
        for (int i = 0, j = 0; i < length; i++) {
            if (ci.containsKey(s.charAt(i))) {
                j = Math.max(ci.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);
            ci.put(s.charAt(i), i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int count = new LongestSubstringWithoutRepeatingCharacters_3().lengthOfLongestSubstring("asdasdasd");
        System.out.println(count);
    }
}
