package leetcode.oo.dp.dfs;

import java.util.stream.IntStream;

//https://leetcode.com/problems/distinct-subsequences-ii/
public final class DistinctSubSeqII {

    public static void main(String[] args) {
        System.out.println(new DistinctSubSeqII().distinctSubseqII(
            "abc"
        ));
    }

    public int distinctSubseqII(String s) {
        final int[] sums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sums[i] = 1 + IntStream.of(sums).sum();
        }
        return IntStream.of(sums).sum();
    }
}
