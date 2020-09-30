package leetcode.oo.dp.greedy;

import java.util.HashSet;
import java.util.Set;
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

    private boolean memo(int[] nums) {
        final int length = nums.length - 1;
        final Set<Integer> memo = new HashSet<>();
        final Jump jump = new Jump() {
            @Override
            public boolean canJump(final int position) {
                if (memo.contains(position)) {
                    return false;
                }
                if (position == length) {
                    return true;
                }
                final int from = Math.min(nums[position] + position, length);
                if (from >= length) {
                    return true;
                }
                if (position + 1 <= from) {
                    for (int i = position + 1; i <= from; i++) {
                        if (this.canJump(i)) {
                            return true;
                        }
                    }
                }
                memo.add(position);
                return false;
            }
        };
        return jump.canJump(0);
    }

    interface Jump {
        boolean canJump(int position);
    }
}
