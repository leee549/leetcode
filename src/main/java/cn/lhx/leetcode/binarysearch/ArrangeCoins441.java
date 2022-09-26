package cn.lhx.leetcode.binarysearch;

/**
 * 441. 排列硬币
 * 你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。
 * 给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数。
 *
 * @author: saltlee
 * @date: 2022/5/26 9:28 上午
 */

public class ArrangeCoins441 {

    /**
     * 等差数列公式:n = k(k+1)/2
     * @param n
     * @return
     */
    public static int arrangeCoins(int n) {
        int left = 1,right = n;
        while (left<= right) {
            int mid = left + (right-left )/2;
            long total = ((long) mid * (mid + 1))/2;
            if (total == n) {
                return mid;
            } else if (total > n) {
                right = mid - 1;
            } else if (total < n ) {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        //1 2 3 4 5
        System.out.println(arrangeCoins(5));
    }
}
