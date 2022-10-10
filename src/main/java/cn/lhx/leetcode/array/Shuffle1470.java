package cn.lhx.leetcode.array;

/**
 * 1470 重新排列数组
 * https://leetcode.cn/problems/shuffle-the-array/
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * @author: saltlee
 * @date: 2022/9/26 10:09 AM
 */
public class Shuffle1470 {


    public static void main(String[] args) {
        //1 4 2 5 3 6
        // 0 1 2 ==> 0 2 4
        // 3 4 5 ==> 1 3 5
        int[] nums = {1,2,3,4,5,6};
        int n = 3;
        System.out.println(shuffle(nums,n));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i]; // 前n个
            res[2 * i + 1] = nums[i + n]; // 后n个
        }
        return res;
    }
}
