package leetcode.oo.dp;

import java.util.Arrays;

//
public final class CountNumberOfTexts {

    public static void main(String[] args) {
        System.out.println(new CountNumberOfTexts().countTexts(
            "22233"
        ));
    }

    private static final int mod = (1000000007);

    private static final int[] key = {0, 0, 3, 3, 3, 3, 3, 4, 3, 4};

    public int countTexts(String pressedKeys) {
        final int[] dp = new int[pressedKeys.length()];
        Arrays.fill(dp, -1);
        return solve(0, pressedKeys, dp) % mod;
    }

    private int solve(final int index, final String pressedKeys, final int[] dp) {
        if (index == pressedKeys.length()) {
            return 1;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int cnt = 0;
        int letters = key[pressedKeys.charAt(index) - '0'];
        for (int i = 0; i < letters && index +i < pressedKeys.length() && pressedKeys.charAt(index) == pressedKeys.charAt(index + i); i++) {
            cnt += this.solve(index + i + 1, pressedKeys, dp);
            cnt %= mod;
        }
        dp[index] = cnt;
        return cnt;
    }
}
