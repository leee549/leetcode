package cn.lhx.leetcode.binarysearch;

import java.util.Arrays;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * <p>
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 *
 * @author: saltlee
 * @date: 2022/5/30 9:52 上午
 */

public class TwoSum167 {

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int left = i+1, right = numbers.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (numbers[i] + numbers[mid] == target) {
                    int a = i + 1;
                    int b = mid + 1;
                    return new int[]{a, b};
                }else if (numbers[i] +numbers[mid] < target ){
                    left = mid +1;
                }else if (numbers[i] +numbers[mid] > target){
                    right = mid  -1 ;
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
