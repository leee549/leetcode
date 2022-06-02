package cn.lhx.leetcode.array;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * @author: lihaox
 * @date: 2022/5/20 10:06 上午
 */

public class FindRepeatNumber3 {

    // [2, 3, 1, 0, 2, 5, 3]
    public static int findRepeatNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;

        /**
         *  Set<Integer> set = new HashSet<>();
         *         int flag = -1;
         *         for (int num : nums) {
         *             if (!set.add(num)){
         *                 flag = num;
         *                 break;
         *             }
         *         }
         *         return flag;
         */

    }
    //[0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int repeatNumber = findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }

}
