package com.ericgarvin.leetcode.easy.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> pickSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            pickSet.add(nums1[i]);
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (pickSet.contains(nums2[i])) {
                nums2[index++] = nums2[i];
                pickSet.remove(nums2[i]);
            }
        }
        return Arrays.copyOfRange(nums2, 0, index);
    }
}
