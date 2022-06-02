package cn.lhx.leetcode.binarysearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: lihaox
 * @date: 2022/5/25 10:14 上午
 */

public class SearchRange34 {

    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int l = -1, r = -1;
        int[] res = {l, r};
        int mid = 0;
        if (nums.length == 0) {
            return res;
        }
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                break;
            }
        }
        l = mid;
        r = mid;
        while (l >= 0 && nums[l] == target) {
            res[0] = l;
            l--;
        }
        while (r < nums.length && nums[r] == target) {
            res[1] = r;
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

}
