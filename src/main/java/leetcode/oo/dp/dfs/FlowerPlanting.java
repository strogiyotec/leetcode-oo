package leetcode.oo.dp.dfs;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/flower-planting-with-no-adjacent/
final class FlowerPlanting {

    private static int[] FLOWERS = {1, 2, 3, 4};

    public int[] gardenNoAdj(final int n, final int[][] paths) {
        final Garden[] gardens = new Garden[n];
        for (int i = 0; i < n; i++) {
            gardens[i] = new Garden();
        }
        for (final int[] path : paths) {
            final int first = path[0] - 1;
            final int second = path[1] - 1;
            gardens[first].add(gardens[second]);
            gardens[second].add(gardens[first]);
        }
        final int[] solution = new int[n];
        for (int i = 0; i < n; i++) {
            gardens[i].setUniqueId();
            solution[i] = gardens[i].setUniqueId();
        }
        return solution;
    }

    static class Garden {
        private int flowerType;
        private final Set<Garden> neighbours;

        public Garden() {
            this.neighbours = new HashSet<>(6);
            this.flowerType = -1;
        }

        public int setUniqueId() {
            final Set<Integer> set = new HashSet<>(8);
            for (final Garden neighbour : this.neighbours) {
                set.add(neighbour.flowerType);
            }
            for (final int flower : FLOWERS) {
                if (!set.contains(flower)) {
                    this.flowerType = flower;
                    return flower;
                }
            }
            return -1;
        }

        public void add(final Garden neighbour) {
            this.neighbours.add(neighbour);
        }

    }
}
