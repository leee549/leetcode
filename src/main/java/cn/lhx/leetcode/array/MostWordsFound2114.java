package cn.lhx.leetcode.array;

/**
 * 2114. 句子中的最多单词数
 * https://leetcode.cn/problems/maximum-number-of-words-found-in-sentences/
 * 一个 句子由一些 单词以及它们之间的单个空格组成，句子的开头和结尾不会有多余空格。
 * 给你一个字符串数组sentences，其中sentences[i]表示单个 句子。
 * 请你返回单个句子里 单词的最多数目。
 * <p>
 * 输入：sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * 输出：6
 * 解释：
 * - 第一个句子 "alice and bob love leetcode" 总共有 5 个单词。
 * - 第二个句子 "i think so too" 总共有 4 个单词。
 * - 第三个句子 "this is great thanks very much" 总共有 6 个单词。
 * 所以，单个句子中有最多单词数的是第三个句子，总共有 6 个单词。
 *
 * @author: saltlee
 * @date: 2022/9/26 10:09 AM
 */
public class MostWordsFound2114 {


    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }

    public static int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String sentence : sentences) {
            String[] size = sentence.split(" ");
            res = Math.max(res,size.length);
        }
        return res;
    }


}
