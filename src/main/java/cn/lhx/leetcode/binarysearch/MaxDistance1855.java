package cn.lhx.leetcode.binarysearch;

/**
 * 1855. 下标对中的最大距离
 * 给你两个 非递增 的整数数组 nums1 和 nums2 ，数组下标均 从 0 开始 计数。
 *
 * 下标对 (i, j) 中 0 <= i < nums1.length 且 0 <= j < nums2.length 。如果该下标对同时满足 i <= j 且 nums1[i] <= nums2[j] ，则称之为 有效 下标对，该下标对的 距离 为 j - i 。
 * 返回所有 有效 下标对 (i, j) 中的 最大距离 。如果不存在有效下标对，返回 0 。
 * 一个数组 arr ，如果每个 1 <= i < arr.length 均有 arr[i-1] >= arr[i] 成立，那么该数组是一个 非递增 数组。
 * @author: saltlee
 * @date: 2022/5/31 11:25 上午
 */

public class MaxDistance1855 {

    public static int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        for (int i = 0; i < nums1.length; i++) {
            int left = i,right = nums2.length-1;
            int temp =0;
            while (left<=right){
                int mid = left + (right - left) / 2;
                if (nums1[i] <= nums2[mid]){
                    //此时不一定是答案，nums2数组不一定最小,将left 往右，最小答案可能在右边
                    temp = mid;
                    left = mid + 1;
                }else if (nums1[i] > nums2[mid]){
                    right = mid -1;
                }
                if(temp >= i){
                    ans = Math.max(ans,temp-i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {50,45,10,2};
        int[] arr2 = {100,50,40,30};
        System.out.println(maxDistance(arr1,arr2));
    }

}
