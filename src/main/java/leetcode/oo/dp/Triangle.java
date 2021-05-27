package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/triangle/
final class Triangle {

    int minimumTotal(final List<List<Integer>> triangle) {
        int index = triangle.size() - 1;
        while (index >= 0) {
            final List<Integer> bottom = triangle.get(index);
            if (index - 1 >= 0) {
                final List<Integer> top = triangle.get(index - 1);
                final List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < top.size(); i++) {
                    final Integer element = top.get(i);
                    temp.add(element + Math.min(bottom.get(i), bottom.get(i + 1)));
                }
                top.clear();
                top.addAll(temp);
            }
            index--;
        }
        return triangle.get(0).get(0);
    }
}
