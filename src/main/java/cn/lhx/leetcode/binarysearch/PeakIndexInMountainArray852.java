package cn.lhx.leetcode.binarysearch;

/**
 * 求山峰数下标
 * @author: saltlee
 * @date: 2022/5/22 9:01 下午
 */

public class PeakIndexInMountainArray852 {
    /**
     * 二分
     *
     * @param arr
     * @return
     */
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1; //此处因为满足山峰条件数组长度最小为3
        int ans = arr.length; // 最极端的时候就是最后一位是山峰
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //减区间
                ans = mid;
                right = mid - 1;//破坏循环条件
            } else {
                //增区间
                left = mid + 1;
            }
        }
        return ans;
    }

    /**
     * 枚举
     *
     * @param arr
     * @return
     */
    public static int peakIndexInMountainArray2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 3, 0};
        System.out.println(peakIndexInMountainArray(arr));
        // System.out.println(peakIndexInMountainArray2(arr));
    }
}
