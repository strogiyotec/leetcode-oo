package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.TreeMap;

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
public final class ReplaceElementWithGreatestElem {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReplaceElementWithGreatestElem().replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    public int[] replaceElements(final int[] arr) {
        final TreeMap<Integer, Integer> set = new TreeMap<>();
        for (final int number : arr) {
            set.merge(number, 1, Integer::sum);
        }
        final int[] elements = new int[arr.length];
        elements[arr.length - 1] = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            final Integer val = set.get(arr[i]);
            if (val - 1 == 0) {
                set.remove(arr[i]);
            } else {
                set.put(arr[i], val - 1);
            }
            final Integer higher = set.lastKey();
            elements[i] = higher;
        }
        return elements;
    }
}
