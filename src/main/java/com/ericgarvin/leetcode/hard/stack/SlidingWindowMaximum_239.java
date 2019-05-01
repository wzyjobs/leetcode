package com.ericgarvin.leetcode.hard.stack;

import com.ericgarvin.leetcode.easy.dp.MaximumSubarray_53;

import java.util.*;

/**
 * 239. 滑动窗口最大值
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k 内的数字。滑动窗口每次只向右移动一位。
 * <p>
 * 返回滑动窗口最大值。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * 注意：
 * <p>
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 输入数组的大小，且输入数组不为空。
 * <p>
 * 进阶：
 * <p>
 * 你能在线性时间复杂度内解决此题吗？
 */
public class SlidingWindowMaximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }
        List<Integer> vector = new ArrayList<>();
        int preIndex = 0, lastIndex = k - 1;
        while (lastIndex != nums.length) {
            int max = findMax(nums, preIndex++, lastIndex++);
            vector.add(max);
        }
        int[] result = new int[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            result[i] = vector.get(i);
        }
        return result;
    }

    private int findMax(int[] nums, int firstIndex, int lastIndex) {
        int maxNum = nums[firstIndex];
        for (int i = firstIndex; i <= lastIndex; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("new SlidingWindowMaximum_239().maxSlidingWindowA(ints,3) = " + Arrays.toString(new SlidingWindowMaximum_239().maxSlidingWindow(ints, 3)));
    }
}
