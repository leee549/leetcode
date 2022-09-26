package cn.lhx.leetcode.binarysearch;

/**
 * 二分法
 * @author: saltlee
 * @date: 2022/5/21 9:54 上午
 */

public class BinarySearch704 {

    public static int search(int[] nums, int target) {
       int start = 0,end = nums.length-1;
       while (start <= end) {
           int mid =(start+end)/2;
           if (nums[mid] > target) {
               //查左边
               end = mid-1;
           } else if (nums[mid] < target) {
               // 查右边
               start = mid+1;
           } else if (nums[mid] == target) {
               return mid;
           }
       }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int target = 5;
        System.out.println(search(nums, target));
    }
}
