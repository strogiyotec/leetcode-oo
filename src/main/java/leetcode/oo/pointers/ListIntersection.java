package leetcode.oo.pointers;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/interval-list-intersections/
final class ListIntersection {

    int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        final List<int[]> solution = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            final int[] second = secondList[secondIndex];
            final int[] first = firstList[firstIndex];
            if (second[0] > first[1]) {
                firstIndex++;
            } else if (first[0] > second[1]) {
                secondIndex++;
            } else {
                solution.add(new int[]{Math.max(second[0], first[0]), Math.min(first[1], second[1])});
                if (first[1] < second[1]) {
                    firstIndex++;
                } else {
                    secondIndex++;
                }
            }
        }
        final int[][] matrix = new int[solution.size()][2];
        for (int i = 0; i < solution.size(); i++) {
            matrix[i] = solution.get(i);
        }
        return matrix;
    }
}
