package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.LinkedList;

//https://leetcode.com/problems/queries-on-a-permutation-with-key/
public final class QueriesOnPermutation {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new QueriesOnPermutation().processQueries(
                    new int[]{4,1,2,2}, 4
                )
            )
        );
    }

    public int[] processQueries(final int[] queries, final int m) {
        final LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        final int[] solution = new int[queries.length];
        int index = 0;
        for (final int query : queries) {
            final int indexOf = list.indexOf(query);
            solution[index] = indexOf;
            list.remove(indexOf);
            list.addFirst(query);
            index++;
        }
        return solution;
    }
}
