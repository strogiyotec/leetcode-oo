package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public final class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysII().intersect(
            new int[]{1, 2, 2, 1},
            new int[]{2, 2}
        )));
    }

    public int[] intersect(final int[] nums1, final int[] nums2) {
        final Map<Integer, Integer> first = new HashMap<>(nums1.length, 1.0f);
        final Map<Integer, Integer> second = new HashMap<>(nums2.length, 1.0f);
        for (final int i : nums1) {
            first.merge(i, 1, Integer::sum);
        }
        for (final int i : nums2) {
            second.merge(i, 1, Integer::sum);
        }
        final List<Integer> list;
        if (nums1.length <= nums2.length) {
            list = new ArrayList<>(nums1.length);
            for (final Map.Entry<Integer, Integer> entry : first.entrySet()) {
                final Integer key = entry.getKey();
                if (second.containsKey(key)) {
                    for (int i = 0; i < Math.min(entry.getValue(), second.get(key)); i++) {
                        list.add(key);
                    }
                }
            }
        } else {
            list = new ArrayList<>(nums2.length);
            for (final Map.Entry<Integer, Integer> entry : second.entrySet()) {
                final Integer key = entry.getKey();
                if (first.containsKey(key)) {
                    for (int i = 0; i < Math.min(entry.getValue(), first.get(key)); i++) {
                        list.add(key);
                    }
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
