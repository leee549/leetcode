package cn.lhx.leetcode.binarysearch;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * 1346. 检查整数及其两倍数是否存在
 * 给你一个整数数组arr，请你检查是否存在两个整数n 和 M，满足是M的两倍（即，N = 2 * M）。
 * 更正式地，检查是否存在两个下标i 和 j 满足：
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * @author: lihaox
 * @date: 2022/5/30 10:17 上午
 */

public class CheckIfExist1364 {

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        // 从左往右
        for (int i = 0; i < arr.length; i++) {
            int left = i +1, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (2 * arr[i]  == arr[mid]) {
                    return true;
                } else if (2 * arr[i] <arr[mid]) {
                    right = mid - 1;

                } else if (2 * arr[i] >arr[mid]) {
                    left = mid + 1;
                }
            }
        }
        // 从右往左
        for (int i = arr.length-1; i > 0 ; --i) {
            int left = 0, right = i -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (2 * arr[i]  ==arr[mid]) {
                    return true;
                } else if (2 * arr[i] <arr[mid]) {
                    right = mid - 1;
                } else if (2 * arr[i] >arr[mid]) {
                    left = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // [-16,-13,8]
        // int[] arr = {-20 ,-10, -8, 12, 15};//-20 -10 -8 12 15
        // System.out.println(checkIfExist(arr));
        // System.out.println(String.format("%60d", "99999"));
        String str = "20220530";
        int strLength = 14;
        int strLen = str.length();
        if (strLen < strLength) {
            while (strLen < strLength) {
                StringBuffer sb = new StringBuffer();
                // sb.append("0").append(str);//左补0
                sb.append(str).append("0");//右补0
                str = sb.toString();
                strLen = str.length();
            }

        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime parse = LocalDateTime.parse(str, dtf);
        String day = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(parse);
        System.out.println(day);
        System.out.println(str);
}}
