package leetcode.oo.arrays;

//https://leetcode.com/problems/kth-missing-positive-number/
final class KthMissingPositive {

    //2 3 5 7 11
    int findKthPositive(final int[] arr, final int k) {
        int i = 0;
        int j = 1;
        int skip = 0;
        while (i < arr.length) {
            if (arr[i] == j) {
                j++;
                i++;
            } else {
                skip++;
                if (skip == k) {
                    return j;
                }
                j++;
            }
        }
        return arr[arr.length - 1] + k - skip;
    }
}
