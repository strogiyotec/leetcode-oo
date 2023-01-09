package leetcode.oo.pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/partition-labels/
final class PartitionLabels {

    List<Integer> partitionLabels(final String line) {
        final Map<Character, Integer> map = new HashMap<>(line.length());
        for (int i = 0; i < line.length(); i++) {
            map.put(line.charAt(i), i);
        }
        int left = 0;
        final List<Integer> list = new ArrayList<>();
        while (left < line.length()) {
            int right = map.get(line.charAt(left));
            int index = left;
            while (right < line.length() && index < right) {
                final Integer next = map.get(line.charAt(index));
                if (right < next) {
                    right = next;
                }
                index++;
            }
            list.add(right - left + 1);
            left = right + 1;
        }
        return list;
    }
}
