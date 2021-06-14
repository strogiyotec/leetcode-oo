package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/duplicate-zeros/
public final class DuplicateZerous {

    public static void main(final String[] args) {
        final int[] ar = {1, 2, 3};
        new DuplicateZerous().duplicateZeros(ar);
        System.out.println(Arrays.toString(ar));

    }

    public void duplicateZeros(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (arr.length - 1 - i >= 0) {
                    System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                }
                if (i + 1 < arr.length) {
                    arr[i + 1] = 0;
                }
                i++;
            }
        }
    }
}
