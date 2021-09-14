package leetcode.oo.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
final class CountSmallerAfterSelf {

    private static class Pair {
        final int val;
        final int index;

        Pair(int index, int val) {
            this.val = val;
            this.index = index;
        }
    }

    public List<Integer> countSmaller(int[] ns) {
        if (ns.length == 0) {
            return Collections.emptyList();
        }
        final List<Integer> ret = new ArrayList<>(ns.length);
        final Pair[] ps = new Pair[ns.length];
        for (int i = 0; i < ns.length; i++) {
            ps[i] = new Pair(i, ns[i]);
        }

        final Integer[] res = new Integer[ns.length]; // must be Integer other than int
        Arrays.fill(res, 0);
        this.mergeSort(ps, 0, ns.length - 1, res);
        ret.addAll(Arrays.asList(res));
        return ret;

    }

    private Pair[] mergeSort(final Pair[] ps, final int left, final int right, final Integer[] res) {
        final int length = right - left + 1;
        final Pair[] sorted = new Pair[length];
        if (length == 0) {
            return sorted;
        }
        if (length == 1) {
            sorted[0] = ps[left];
            return sorted;
        }
        final int middle = length / 2 + left;
        final Pair[] leftArr = this.mergeSort(ps, left, middle - 1, res);
        final Pair[] rightArr = this.mergeSort(ps, middle, right, res);
        int leftIndex = 0;
        int rightIndex = 0;
        int sortedIndex = 0;
        while (leftIndex < leftArr.length || rightIndex < rightArr.length) {
            if (rightIndex == rightArr.length || leftIndex < leftArr.length && leftArr[leftIndex].val <= rightArr[rightIndex].val) {
                sorted[sortedIndex] = leftArr[leftIndex];
                res[leftArr[leftIndex].index] += rightIndex;
                leftIndex++;
            } else {
                sorted[sortedIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            sortedIndex++;
        }
        return sorted;
    }

}
