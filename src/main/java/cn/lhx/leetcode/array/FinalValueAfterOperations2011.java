package cn.lhx.leetcode.array;

/**
 * https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/
 * 存在一种仅支持 4 种操作和 1 个变量 X 的编程语言：
 * ++X 和 X++ 使变量 X 的值 加 1
 * --X 和 X-- 使变量 X 的值 减 1
 * 最初，X 的值是 0
 * 给你一个字符串数组 operations ，这是由操作组成的一个列表，返回执行所有操作后， X 的 最终值 。
 * <p>
 * 输入：operations = ["--X","X++","X++"]
 * 输出：1
 * 解释：操作按下述步骤执行：
 * 最初，X = 0
 * --X：X 减 1 ，X =  0 - 1 = -1
 * X++：X 加 1 ，X = -1 + 1 =  0
 * X++：X 加 1 ，X =  0 + 1 =  1
 *
 * @author: saltlee
 * @date: 2022/9/26 10:09 AM
 */
public class FinalValueAfterOperations2011 {


    public static void main(String[] args) {
        String[] arr = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(arr));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                res = res + 1;
            } else {
                res = res - 1;
            }
        }
        return res;
    }


}
