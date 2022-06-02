package cn.lhx.leetcode.binarysearch;

/**
 * 判断是否完全平方数
 * @author: lihaox
 * @date: 2022/5/23 9:43 上午
 */

public class IsPerfectSquare367 {

    public static boolean isPerfectSquare(int num) {
        int left =0,right = num;
        while (left<=right){
            int mid = ((right-left)>>2)+left;
            long square = (long) mid * mid;
            if (square>num){
                right = mid -1;
            }else if (square<num) {
                left = mid +1;
            }else if (square==num){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
    }
}
