package leetcode.oo.dp.dfs;

import java.util.Arrays;

//https://leetcode.com/problems/distinct-subsequences-ii/
public final class DistinctSubSeqII {

    public static void main(String[] args) {
        System.out.println(new DistinctSubSeqII().distinctSubseqII(
            "abc"
        ));
    }

    public int distinctSubseqII(String s) {
        long mod = (long) (1.0e9 + 7);
        final long[] sequences = new long[26];
        for (int i = 0; i < s.length(); i++) {
            sequences[s.charAt(i) - 'a'] = 1 + Arrays.stream(sequences).sum() % mod;
        }
        return (int) (Arrays.stream(sequences).sum() % mod);
    }
}
