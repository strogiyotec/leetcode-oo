package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//https://leetcode.com/problems/relative-sort-array/
final class RelativeOrder {

    int[] relativeSortArray(final int[] arr1, final int[] arr2) {
        final TreeMap<Integer, Integer> firstCnt = new TreeMap<>();
        final Set<Integer> set = new HashSet<>(arr1.length);
        for (final int number : arr1) {
            firstCnt.merge(number, 1, Integer::sum);
            set.add(number);
        }
        int index = 0;
        for (final int number : arr2) {
            if (set.contains(number)) {
                for (int i = 0; i < firstCnt.get(number); i++) {
                    arr1[index] = number;
                    index++;
                }
                firstCnt.remove(number);
            }
        }
        for (final Map.Entry<Integer, Integer> entry : firstCnt.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                arr1[index] = entry.getKey();
                index++;
            }
        }
        return arr1;

    }
}
