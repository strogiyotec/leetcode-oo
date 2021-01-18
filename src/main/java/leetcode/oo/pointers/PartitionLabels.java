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
        final List<Integer> solution = new ArrayList<>(line.length());
        while (left < line.length()) {
            int end = map.get(line.charAt(left));
            int right = left;
            while (right != end) {
                end = Math.max(end, map.get(line.charAt(right)));
                right++;
            }
            solution.add(right - left + 1);
            left = right + 1;
        }
        return solution;
    }
}
