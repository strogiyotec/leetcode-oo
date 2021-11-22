package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/minimum-index-sum-of-two-lists/
public final class MinIndexSum {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new MinIndexSum().findRestaurant(
                    new String[]{
                        "Shogun", "Tapioca Express", "Burger King", "KFC"
                    },
                    new String[]{
                        "KFC", "Burger King", "Tapioca Express", "Shogun"
                    }
                )
            )
        );
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        final Map<String, Integer> first = new HashMap<>(list1.length << 1, 1);
        final Map<String, Integer> second = new HashMap<>(list2.length << 1, 1);
        for (int i = 0; i < list1.length; i++) {
            first.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            second.put(list2[i], i);
        }
        final List<String> solution = new ArrayList<>(list1.length + list2.length);
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (final String current : list1) {
            final Integer firstIndex = first.get(current);
            final Integer secIndex = second.getOrDefault(current, -1);
            if (!secIndex.equals(-1)) {
                if (secIndex + firstIndex < min) {
                    min = secIndex + firstIndex;
                    index = solution.size();
                    solution.add(current);
                } else if (secIndex + firstIndex == min) {
                    solution.add(current);
                }
            }
        }
        return solution.subList(index, solution.size()).toArray(new String[]{});
    }
}
