package cn.lhx.leetcode.binarysearch;

import java.util.Scanner;

/**
 * 猜数字
 * @author: saltlee
 * @date: 2022/5/21 11:02 上午
 */

public class GuessNumber374 {

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }

    public static int guessNumber(int n) {
        int start =1 ,end = n;
        while (start<end) {
            // int mid = start+(end-start) / 2;
            int mid = (start+end) / 2;
            int guess = guess(mid);
            if (guess ==-1 ){
                // System.out.println("太大");
                end = mid-1;
            }else if (guess==1) {
                // System.out.println("太小");
                start =mid+1;
            }else{
                // System.out.println("猜中了");
                return mid;
            }
        }
        return start;
    }


    public static int guess(int n) {
        int pick = 3;
        if (n > pick) {// 太大
            return -1;
        } else if (n < pick) { // 太小
            return 1;
        } else {
            return 0;
        }
    }
}
