package cn.lhx.leetcode.binarysearch;

import java.util.Arrays;

/**
 * 两个数组间距离
 *
 * 给你两个整数数组arr1，arr2和一个整数d，请你返回两个数组之间的距离值。
 *
 * 「距离值」定义为符合此距离要求的元素数目：对于元素arr1[i]，不存在任何元素arr2[j]满足 |arr1[i]-arr2[j]| <= d 。
 *
 * @author: lihaox
 * @date: 2022/5/23 10:10 上午
 */

public class FindTheDistanceValue1385 {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans =0;
        // 暴力法
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i]-arr2[j])<=d) {
                    break;
                }else if (j==arr2.length-1){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for (int num1 : arr1) {
            int low = num1 - d;
            int high = num1 + d;
            if (!binarySearch(arr2, low, high)) {
                ans++;
            }
        }

        return ans;
    }

    public static boolean binarySearch(int[] arr, int low, int high) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= low && arr[mid] <= high) {
                return true;
            } else if (arr[mid] < low) {
                left = mid + 1;
            } else if (arr[mid] > high) {
                right = mid - 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr1 = {5,2,3,4};
        int[] arr2 = {5,6,7,8};
        int d = 2;
        // System.out.println(findTheDistanceValue(arr1, arr2, d));
        System.out.println(findTheDistanceValue2(arr1, arr2, d));
    }
}
