package leetcode.oo.arrays.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//https://leetcode.com/problems/sort-the-matrix-diagonally/
public final class SortDiagonally {

    public static void main(final String[] args) {
        System.out.println(
            Arrays.deepToString(
                new SortDiagonally().diagonalSort(
                    new int[][]{
                        {3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}
                    }
                )));
    }

    public int[][] diagonalSort(int[][] mat) {
        final List<List<Integer>> lists = new ArrayList<>(mat.length);
        for (int i = mat.length - 1; i >= 1; i--) {
            final List<Integer> list = new ArrayList<>(mat.length);
            for (int j = 0, row = i; j < mat[0].length && row < mat.length; j++, row++) {
                list.add(mat[row][j]);
            }
            Collections.sort(list);
            lists.add(list);
        }
        for (int j = 0; j < mat[0].length; j++) {
            final List<Integer> list = new ArrayList<>(mat.length);
            int row = 0;
            int col = j;
            while (row < mat.length && col < mat[0].length) {
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list);
            lists.add(list);
        }
        final int[][] sorted = new int[mat.length][mat[0].length];
        int row = mat.length - 1;
        while (row >= 0) {
            final ListIterator<List<Integer>> iterator = lists.listIterator();
            int col = 0;
            while (iterator.hasNext() && col < sorted[0].length) {
                final List<Integer> next = iterator.next();
                final Integer last = next.remove(next.size() - 1);
                sorted[row][col] = last;
                if (next.isEmpty()) {
                    iterator.remove();
                }
                col++;
            }
            row--;
        }
        return sorted;
    }
}
