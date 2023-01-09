package leetcode.oo.math;

//https://leetcode.com/problems/greatest-sum-divisible-by-three/
final class SumDivThree {

    public int maxSumDivThree(final int[] nums) {
        int[] cache = new int[3];
        for (final int num : nums) {
            final int[] nextCache = cache.clone();
            for (final int maxValue : cache) {
                final int nextMax = maxValue + num;
                final int index = nextMax % 3;
                nextCache[index] = Math.max(nextCache[index],nextMax);
            }
            cache = nextCache;
        }
        return cache[0];
    }
}
