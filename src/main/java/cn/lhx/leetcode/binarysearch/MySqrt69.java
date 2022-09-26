package cn.lhx.leetcode.binarysearch;

/**
 * 求算数平方根
 * @author: saltlee
 * @date: 2022/5/24 9:20 上午
 */

public class MySqrt69 {

    public static int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square < x) {
                ans = mid;
                left = mid + 1;
            } else if (square > x) {
                right = mid - 1;
            } else if (square == x) {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
