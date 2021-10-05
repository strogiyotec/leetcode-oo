package leetcode.oo.arrays;

//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
final class SumOfAllOdd {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            final int cnt = (arr.length - i) * (i + 1);
            if (cnt % 2 == 0) {
                sum += cnt / 2 * arr[i];
            } else {
                sum += (cnt / 2 + 1) * arr[i];
            }
        }
        return sum;
    }
}
