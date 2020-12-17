package leetcode.oo.dp;

import java.util.Arrays;

/**
 * Maximum Height by Stacking Cuboids .
 * See {@link <a href ="https://leetcode.com/problems/maximum-height-by-stacking-cuboids/">https://leetcode.com/problems/maximum-height-by-stacking-cuboids/</a>}
 */
final class Cubes {

    int maxHeight(int[][] cuboids) {
        for (final int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }
        Arrays.sort(cuboids, (first, second) -> {
            if (first[0] != second[0]) {
                return second[0] - first[0];
            } else if (first[1] != second[1]) {
                return second[1] - first[1];
            } else {
                return second[2] - first[2];
            }
        });
        final int[] dp = new int[cuboids.length];
        int result = 0;
        for (int i = 0; i < cuboids.length; i++) {
            dp[i] = cuboids[i][2];
            for (int j = 0; j < i; j++) {
                if (cuboids[j][0] >= cuboids[i][0] && cuboids[j][1] >= cuboids[i][1] && cuboids[j][2] >= cuboids[i][2]) {
                    dp[i] = Math.max(dp[i], dp[j] + cuboids[i][2]);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

}
