package leetcode.oo.dp.greedy;

import leetcode.oo.IntPair;

/**
 * Jump Game.
 * See {@link <a href ="https://leetcode.com/problems/jump-game/">https://leetcode.com/problems/jump-game/</a>}.
 */
final class JumpGame {

    boolean canJump(final int[] nums) {
        IntPair pair = new IntPair(0, 0);
        while (true) {
            int canRich = -1;
            for (int i = pair.getFirst(); i <= pair.getSecond(); i++) {
                canRich = Math.max(canRich, nums[i] + i);
            }
            if (canRich >= nums.length - 1) {
                return true;
            }
            pair = new IntPair(pair.getSecond() + 1, canRich);
            if (pair.getFirst() > pair.getSecond()) {
                return false;
            }
        }
    }
}
