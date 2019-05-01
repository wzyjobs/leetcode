package com.ericgarvin.leetcode.easy.array;

import java.util.HashSet;

/**
 * 217. 存在重复元素
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        return nums.length == numSet.size() ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate_217().containsDuplicate(new int[]{1, 2, 34, 5, 6, 7}));
    }
}
