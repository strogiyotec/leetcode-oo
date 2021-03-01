package leetcode.oo.arrays;

final class OddSumSubArrays {

    int numOfSubarrays(final int[] arr) {
        final int mod = 1_000_000_007;
        int even = 1;
        int odd = 0;
        int res = 0;
        int sum = 0;
        for (final int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                even++;
                res = (res + odd) % mod;
            } else {
                odd++;
                res = (res + even) % mod;
            }
        }
        return res;
    }
}
