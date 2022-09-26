package cn.lhx.leetcode.binarysearch;

import java.util.Arrays;

/**
 * 1608. 特殊数组的特征值
 *
 * 给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素 大于或者等于 x ，那么就称 nums 是一个 特殊数组 ，而 x 是该数组的 特征值 。
 *
 * 注意： x 不必 是 nums 的中的元素。
 *
 * 如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回 -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的 。
 *
 * @author: saltlee
 * @date: 2022/5/27 10:25 下午
 */

public class SpecialArray1608 {

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int left = 0,right = nums.length;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (sumArray(nums,mid) == mid ){
                return mid;
            }else if (sumArray(nums,mid) > mid ){
                left = mid +1;
            }else if (sumArray(nums,mid) < mid) {
                right = mid-1;

            }
        }
        return -1;

    }

    // 求大于target的数量
    private static int sumArray(int[] nums,int i) {
        int sum =0;
        for (int num : nums) {
            if(num >= i){
                sum++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        specialArray(arr);
    }
}
