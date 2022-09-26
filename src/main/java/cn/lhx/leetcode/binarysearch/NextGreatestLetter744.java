package cn.lhx.leetcode.binarysearch;

/**
 * 寻找比目标字母大的最小字母
 *
 * @author: saltlee
 * @date: 2022/5/24 9:44 下午
 */

public class NextGreatestLetter744 {

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        int res =0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] < target) {
                left = mid + 1;
            } else if (letters[mid] == target) {
                left = mid + 1;
            } else if (letters[mid] > target) {
                res = mid;
                right = mid - 1;
            }
        }
        return letters[res];
    }


    public static void main(String[] args) {
        char[] chars = new char[]{'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(chars, 'j'));
    }
}
