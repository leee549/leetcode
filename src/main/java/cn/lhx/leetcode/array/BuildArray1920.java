package cn.lhx.leetcode.array;

import java.util.Arrays;

/**
 * 1920. 基于排列构建数组
 * 给你一个 从 0 开始的排列 nums（下标也从 0 开始）。请你构建一个 同样长度 的数组 ans ，其中，对于每个 i（0 <= i < nums.length），都满足 ans[i] = nums[nums[i]] 。返回构建好的数组 ans 。
 * <p>
 * 从 0 开始的排列 nums 是一个由 0 到 nums.length - 1（0 和 nums.length - 1 也包含在内）的不同整数组成的数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/build-array-from-permutation
 *
 * @author: saltlee
 * @date: 2022/5/20 10:06 上午
 */

public class BuildArray1920 {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i : nums) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

}
