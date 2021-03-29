package leetcode.oo.arrays;

//https://leetcode.com/problems/kth-missing-positive-number/
final class KthMissingPositive {

    //2 3 5 7 11
    int findKthPositive(final int[] arr, final int k) {
        int index = 0;
        int missing = 1;
        int skip = 0;
        while (index < arr.length) {
            if (arr[index] == missing) {
                index++;
                missing++;
            } else {
                skip++;
                if (skip == k) {
                    return missing;
                }
                missing++;
            }
        }
        return arr[arr.length - 1] + k - skip;
    }
}
