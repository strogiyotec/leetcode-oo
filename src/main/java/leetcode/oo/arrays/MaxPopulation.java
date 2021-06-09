package leetcode.oo.arrays;

import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/maximum-population-year/
public final class MaxPopulation {

    public static void main(String[] args) {
        System.out.println(new MaxPopulation().maximumPopulation(
            new int[][]{
                {1950, 1961}, {1960, 1971}, {1970, 1981}
            }
        ));
    }

    public int maximumPopulation(final int[][] logs) {
        final TreeMap<Integer, Integer> map = new TreeMap<>();
        for (final int[] log : logs) {
            map.putIfAbsent(log[0], 0);
            map.putIfAbsent(log[1], 0);
            map.merge(log[0], 1, Integer::sum);
            map.merge(log[1], -1, Integer::sum);
        }
        int max = 0;
        int prefixSum = 0;
        int year = 0;
        for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
            prefixSum += entry.getValue();
            if (prefixSum > max) {
                max = prefixSum;
                year = entry.getKey();
            }
        }
        return year;
    }
}
