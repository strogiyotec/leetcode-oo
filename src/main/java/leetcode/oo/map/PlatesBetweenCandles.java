package leetcode.oo.map;

import java.util.TreeMap;

//https://leetcode.com/problems/plates-between-candles/
final class PlatesBetweenCandles {

    public int[] platesBetweenCandles(String s, int[][] queries) {
        final TreeMap<Integer, Integer> map = new TreeMap<>();
        int cntPlates = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                map.put(i, cntPlates);
            } else {
                cntPlates++;
            }
        }
        final int[] solution = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            final int[] query = queries[i];
            var left = map.ceilingEntry(query[0]);
            var right = map.floorEntry(query[1]);
            if (left != null && right != null) {
                solution[i] = Math.max(0, right.getValue() - left.getValue());
            }
        }
        return solution;
    }
}
