package leetcode.oo.map;

//https://leetcode.com/problems/binary-subarrays-with-sum/
final class BinarySubArrayWithSum {

    int numSubarraysWithSum(final int[] array, final int sum) {
        final int[] cnt = new int[array.length + 1];
        cnt[0] = 1;
        int currentSum = 0;
        int res = 0;
        for (final int number : array) {
            currentSum += number;
            if (currentSum >= sum) {
                res += cnt[currentSum - sum];
            }
            cnt[currentSum]++;
        }
        return res;
    }
}
