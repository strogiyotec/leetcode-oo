package leetcode.oo.arrays;

/**
 * Good pairs.
 * See {@link <a href ="https://leetcode.com/problems/number-of-good-pairs/">https://leetcode.com/problems/number-of-good-pairs/</a>}
 */
final class GoodPairs {

    int numIdenticalPairs(final int[] nums) {
        //101 according to Leetcode requirements
        final int[] map = new int[101];
        int cnt = 0;
        for (final int number : nums) {
            cnt += map[number];
            map[number]++;
        }
        return cnt;
    }
}
