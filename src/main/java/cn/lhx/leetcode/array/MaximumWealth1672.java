package cn.lhx.leetcode.array;

import java.util.Arrays;

/**
    1672. 最富有客户的资产总量
 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。

 输入：accounts = [[1,2,3],[3,2,1]]
 输出：6
 解释：
 第 1 位客户的资产总量 = 1 + 2 + 3 = 6
 第 2 位客户的资产总量 = 3 + 2 + 1 = 6
 两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。

 来源：力扣（LeetCode）
 链接：https://leetcode.cn/problems/richest-customer-wealth
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: saltlee
 * @date: 2022/5/20 10:06 上午
 */

public class MaximumWealth1672 {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{2,3,4}};
        System.out.println(maximumWealth2(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum +i;
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }
    public static int maximumWealth2(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
          res = Math.max(res, Arrays.stream(account).sum());
        }
        return res;
    }

}
