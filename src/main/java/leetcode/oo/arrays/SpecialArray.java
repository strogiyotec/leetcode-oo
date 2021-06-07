package leetcode.oo.arrays;

import java.util.NavigableMap;
import java.util.TreeMap;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public final class SpecialArray {

    public static void main(String[] args) {
        System.out.println(new SpecialArray().specialArray(new int[]{3, 5}));
        System.out.println(new SpecialArray().specialArray(new int[]{0, 0}));
        System.out.println(new SpecialArray().specialArray(new int[]{0,4,3,0,4}));
        System.out.println(new SpecialArray().specialArray(new int[]{3,6,7,7,0}));
    }

    public int specialArray(final int[] nums) {
        final TreeMap<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
            max = Math.max(max, num);
        }
        for (int i = 0; i <= max; i++) {
            final NavigableMap<Integer, Integer> bigger = map.tailMap(i, true);
            int cnt = 0;
            for (final Integer value : bigger.values()) {
                cnt += value;
            }
            if (cnt == i) {
                return cnt;
            }
        }
        return -1;
    }
}
