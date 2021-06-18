package leetcode.oo.dp;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/maximum-length-of-pair-chain/
public final class MaxLengthPairChain {

    public static void main(String[] args) {
        System.out.println(
            new MaxLengthPairChain().findLongestChain(
                new int[][]{
                    {1, 2}, {2, 3}, {3, 4}
                }
            )
        );
        System.out.println(
            new MaxLengthPairChain().findLongestChain(
                new int[][]{
                    {1, 2}, {7, 8}, {4, 5}
                }
            )
        );
    }

    public int findLongestChain(final int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int longest = 1;
        int[] last = pairs[0];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > last[1]) {
                longest++;
                last = pairs[i];
            }
        }
        return longest;
    }
}
