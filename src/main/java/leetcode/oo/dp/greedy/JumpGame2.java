package leetcode.oo.dp.greedy;

import leetcode.oo.IntPair;

/**
 * Jump Game 2.
 * See {@link <a href ="https://leetcode.com/problems/jump-game-ii/">https://leetcode.com/problems/jump-game-ii/</a>}.
 */
final class JumpGame2 {

    int jump(final int[] nums) {
        int jumps = 0;
        IntPair pair = new IntPair(0, 0);
        while (pair.getSecond() >= pair.getFirst()) {
            jumps++;
            int cursour = -1;
            for (int i = pair.getFirst(); i <= pair.getSecond(); i++) {
                cursour = Math.max(i + nums[i], cursour);
                if (cursour >= nums.length - 1) {
                    return jumps;
                }
            }
            pair = new IntPair(pair.getSecond() + 1, cursour);
        }
        return jumps;
    }
}
