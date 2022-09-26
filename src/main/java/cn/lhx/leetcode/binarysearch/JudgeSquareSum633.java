package cn.lhx.leetcode.binarysearch;

/**
 * 633. 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * @author: saltlee
 * @date: 2022/5/31 10:59 上午
 */

public class JudgeSquareSum633 {

    public static boolean judgeSquareSum(int c) {
        if (c==0){
            return true;
        }
        // 如果i平方都大于等于c 都不用查了
        for (long i = 0; i*i < c ;i++ ){
            long left = i,right = c;
            while (left<=right) {
                long mid = left+(right-left)/2;
                long num = (long)Math.pow(mid, 2) + (long)Math.pow(i, 2);
                if (num == c ) {
                    return true;
                }else if (num < c){
                    left = mid +1;
                }else if (num > c){
                    right = mid -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(8));
    }

}
