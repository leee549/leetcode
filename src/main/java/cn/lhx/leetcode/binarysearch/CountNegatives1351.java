package cn.lhx.leetcode.binarysearch;

/**
 * @author: lihaox
 * @date: 2022/5/27 11:54 下午
 */

public class CountNegatives1351 {

    // 暴力法
    public static int countNegatives1(int[][] grid) {
        int sum =0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt<0){
                   sum++;
                }
            }
        }
        return sum;
    }

    public static int countNegatives(int[][] grid) {
        int sum= 0;
        for (int[] ints : grid) {
            int index = search(ints);
            if (ints[ints.length-1]<0){
                sum += (ints.length-index);
            }
        }
        return sum;
    }

    private static int search(int[] arr) {
        int left = 0,right = arr.length-1;
        int index=0;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if(arr[mid] <0 ){
                index = mid;
               right = mid-1;
            }else if (arr[mid] >=0){
                left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [][] arr = {{-1,-2,-3},{4,3,-1,-2}};
        System.out.println(countNegatives(arr));
    }
}
