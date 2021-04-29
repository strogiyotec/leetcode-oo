package leetcode.oo.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/interval-list-intersections/
final class ListIntersection {

    int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) {
            return new int[0][0];
        }
        final List<List<Integer>> solution = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            if ((firstList[firstIndex][1] <= secondList[secondIndex][1] && firstList[firstIndex][1] >= secondList[secondIndex][0]) ||
                (secondList[secondIndex][1] <= firstList[firstIndex][1] && secondList[secondIndex][1] >= firstList[firstIndex][0])
            ) {
                solution.add(
                    Arrays.asList(
                        Math.max(firstList[firstIndex][0], secondList[secondIndex][0]),
                        Math.min(firstList[firstIndex][1], secondList[secondIndex][1])
                    )
                );
            }
            if (firstList[firstIndex][1] <= secondList[secondIndex][1]) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }
        final int[][] asMatrix = new int[solution.size()][2];
        for (int i = 0; i < solution.size(); i++) {
            asMatrix[i] = new int[]{solution.get(i).get(0), solution.get(i).get(1)};
        }
        return asMatrix;
    }
}
