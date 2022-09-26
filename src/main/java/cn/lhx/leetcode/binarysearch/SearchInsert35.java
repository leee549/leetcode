package cn.lhx.leetcode.binarysearch;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * @author: saltlee
 * @date: 2022/5/22 4:30 下午
 */

public class SearchInsert35 {

    public static int searchInsert(int[] nums, int target) {
        int start=0,end = nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (nums[mid]>target){
                end = mid-1;
            }else if (nums[mid]<target) {
                start = mid+1;
            }else if (nums[mid] == target){
                return mid;
            }
        }
        // 能走到这里说明数组中不存在target，且插入位置一定是start后面
        return start;
    }

    public static void main(String[] args) {
        int[] nums =new int[]{1,3,5};
        System.out.println(searchInsert(nums, 5));
    }
}
