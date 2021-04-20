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
        final List<Integer> list = new ArrayList<>(line.length());
        int left = 0;
        while (left < line.length()) {
            int right = left;
            int max = map.get(line.charAt(left));
            while (right < max) {
                right++;
                max = Math.max(map.get(line.charAt(right)), max);
            }
            list.add(right - left + 1);
            left = right + 1;
        }
        return list;
    }
}
