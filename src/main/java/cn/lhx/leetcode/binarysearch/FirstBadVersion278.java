package cn.lhx.leetcode.binarysearch;


/**
 * @author: lihaox
 * @date: 2022/5/25 9:39 上午
 */

public class FirstBadVersion278 {

    public static int firstBadVersion(int n) {
        int left = 1 ,right = n ;
        int ans = -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (isBadVersion(mid)){
                // 错误版本
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));
    }

    public static boolean isBadVersion(int v) {
        return v >= 4;// 从哪个版本开始错
    }
}
