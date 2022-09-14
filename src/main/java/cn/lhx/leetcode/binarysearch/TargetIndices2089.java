package cn.lhx.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. 找出数组排序后的目标下标
 * 给你一个下标从 0 开始的整数数组 nums 以及一个目标元素 target 。
 *
 * 目标下标 是一个满足 nums[i] == target 的下标 i 。
 * 将 nums 按 非递减 顺序排序后，返回由 nums 中目标下标组成的列表。如果不存在目标下标，返回一个 空 列表。返回的列表必须按 递增 顺序排列。
 * @author: lihaox
 * @date: 2022/6/4 11:08 下午
 */

public class TargetIndices2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0,right = nums.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (nums[mid] == target) {
                res.add(mid);
                right = mid -1;

            }else if (nums[mid] > target) {
                right = mid -1;
            }else if (nums[mid] < target){
                left = mid +1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5};
        int target = 3;
        System.out.println(targetIndices(arr,target));
    }
}
