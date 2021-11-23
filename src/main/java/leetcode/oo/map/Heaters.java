package leetcode.oo.map;

import java.util.TreeSet;

//https://leetcode.com/problems/heaters/
public final class Heaters {

    public int findRadius(final int[] houses, final int[] heaters) {
        final TreeSet<Integer> set = new TreeSet<>();
        for (final int heater : heaters) {
            set.add(heater);
        }
        int minRange = 0;
        for (final int house : houses) {
            Integer higher = set.ceiling(house);
            Integer lower = set.floor(house);
            if (higher != null || lower != null) {
                higher = higher == null ? Integer.MAX_VALUE : higher;
                lower = lower == null ? Integer.MIN_VALUE : lower;
            } else {
                higher = set.first();
                lower = set.last();
            }
            minRange = Math.max(
                minRange,
                Math.min(
                    Math.abs(higher - house),
                    Math.abs(house - lower)
                )
            );
        }
        return minRange;
    }
}
