package cn.lhx.leetcode.binarysearch;

/**
 * @author: saltlee
 * @date: 2022/5/29 10:01 上午
 */

public class SearchMatrix74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        boolean flag = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] < target) {
                left = mid + 1;
                // 二分查找行
                flag = search(matrix[mid],target);
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else if (matrix[mid][0] == target) {
                return true;
            }
        }
        return flag;
    }
    public static boolean search(int[] arr,int target){
        int left = 0,right = arr.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (arr[mid] < target) {
                left = mid +1;
            }else if (arr[mid] > target) {
                right = mid -1;
            } else if (arr[mid] == target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {6, 8, 9, 10},
                {12, 13, 15, 17}
        };
        System.out.println(searchMatrix(arr, 11));
    }
}
