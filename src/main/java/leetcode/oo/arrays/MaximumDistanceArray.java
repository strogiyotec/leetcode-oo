package leetcode.oo.arrays;

import java.util.List;

public final class MaximumDistanceArray {

    public int maxDistance(final List<List<Integer>> arrays) {
        int result = Integer.MIN_VALUE;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < arrays.size(); i++) {
            final List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);
            result = Math.max(result, currentMax - min);
            result = Math.max(result, max - currentMin);
            min = Math.min(min,currentMin);
            max = Math.max(max,currentMax);
        }
        return result;
    }
}
