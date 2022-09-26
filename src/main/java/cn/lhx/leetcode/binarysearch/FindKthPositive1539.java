package cn.lhx.leetcode.binarysearch;

/**
 * 1539. 第 k 个缺失的正整数
 * 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
 * 请你找到这个数组里第 k 个缺失的正整数。
 * @author: saltlee
 * @date: 2022/5/26 10:24 上午
 */

public class FindKthPositive1539 {

    public static int findKthPositive(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return k;
        }
        int left = 0,right = arr.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid] - mid - 1 > k ) {
                // 说明缺失不止一个数
                right = mid - 1;
            }else if (arr[mid] - mid - 1 < k) {
                left = mid + 1;
            }else if (arr[mid] - mid -1 == k){
                // 说明刚好缺失一个数
                right = mid -1;
            }
        }
        // left 是最终满足缺失条件的位置，因为right 会 -1 破坏条件
        return left + k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10};
        System.out.println(findKthPositive(arr,2));
    }
}
