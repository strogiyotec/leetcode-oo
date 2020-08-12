package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.Set;


/**
 * Arrays Intersection.
 * See {@link <a href ="https://leetcode.com/problems/intersection-of-two-arrays/">https://leetcode.com/problems/intersection-of-two-arrays/</a>}
 */
final class ArraysIntersection {

    int[] intersection(final int[] nums1, final int[] nums2) {
        final Set<Integer> set1 = new HashSet<>(nums1.length);
        for (final int i : nums1) {
            set1.add(i);
        }
        final Set<Integer> set2 = new HashSet<>(nums2.length);
        for (final int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        return set1.stream().mapToInt(i -> i).toArray();
    }
}
