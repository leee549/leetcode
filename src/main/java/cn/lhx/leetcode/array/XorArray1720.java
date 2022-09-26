package cn.lhx.leetcode.array;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/decode-xored-array/
 * 未知 整数数组 arr 由 n 个非负整数组成。
 * 经编码后变为长度为 n - 1 的另一个整数数组 encoded ，其中 encoded[i] = arr[i] XOR arr[i + 1] 。例如，arr = [1,0,2,1] 经编码后得到 encoded = [1,2,3] 。
 * 给你编码后的数组 encoded 和原数组 arr 的第一个元素 first（arr[0]）。
 * 请解码返回原数组 arr 。可以证明答案存在并且是唯一的。

 * @author: saltlee
 * @date: 2022/9/26 10:09 AM
 */
public class XorArray1720 {


    public static void main(String[] args) {
        int[] encoded = {1, 2, 3, 4};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }


    /**
     异或运算具有如下性质：
         异或运算满足交换律和结合律；
         任意整数和自身做异或运算的结果都等于0
         任意整数和0做异或运算的结果都等于其自身

     由于encoded[i] = arr[i] XOR arr[i + 1]，=》同时i-1有
     encoded[i-1] = arr[i-1] XOR arr[i]
        在等号两边同时异或:
        encoded[i-1] ^ arr[i - 1] = arr[i-1] ^ arr[i] ^ arr[i-1]

     */
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < encoded.length + 1; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }


}
