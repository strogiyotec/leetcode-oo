package leetcode.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/
public final class MaxAreaCake {

    public static void main(String[] args) {
        System.out.println(
            new MaxAreaCake().maxArea(
                5, 4, new int[]{1, 2, 4}, new int[]{1, 3}
            )
        );
    }

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        final List<Integer> allHorizCuts = new ArrayList<>(horizontalCuts.length + 2);
        final List<Integer> allVertCuts = new ArrayList<>(verticalCuts.length + 2);
        allHorizCuts.add(0);
        allVertCuts.add(0);
        for (final int cut : horizontalCuts) {
            allHorizCuts.add(cut);
        }
        for (final int cut : verticalCuts) {
            allVertCuts.add(cut);
        }
        allHorizCuts.add(h);
        allVertCuts.add(w);
        int maxWidth = 0;
        int maxHeight = 0;
        for (int i = 1; i < allHorizCuts.size(); i++) {
            maxWidth = Math.max(maxWidth, allHorizCuts.get(i) - allHorizCuts.get(i - 1));
        }
        for (int i = 1; i < allVertCuts.size(); i++) {
            maxHeight = Math.max(maxHeight, allVertCuts.get(i) - allVertCuts.get(i - 1));
        }
        return (int) ((long) maxWidth * maxHeight % 1_000_000_007);
    }
}
