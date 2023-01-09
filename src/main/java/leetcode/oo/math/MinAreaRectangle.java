package leetcode.oo.math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/minimum-area-rectangle/
public final class MinAreaRectangle {

    public int minAreaRect(final int[][] points) {
        final Map<Integer, Set<Integer>> map = new HashMap<>(points.length);
        for (final int[] point : points) {
            map.computeIfAbsent(point[0], integer -> new HashSet<>()).add(point[1]);
        }
        int min = Integer.MAX_VALUE;
        for (final int[] first : points) {
            for (final int[] second : points) {
                if(first[0] == second[0] || first[1] == second[1]){
                    continue;
                }
                if(map.get(first[0]).contains(second[1]) && map.get(second[0]).contains(first[1])){
                    min = Math.min(
                        min,
                        Math.abs(first[0]-second[0])*Math.abs(first[1]-second[1])
                    );
                }
            }
        }
        return min;
    }
}
