package leetcode.oo.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/finding-the-users-active-minutes/
public final class UsersActiveMinutes {

    public static void main(final String[] args) {
        System.out.println(
            Arrays.toString(
                new UsersActiveMinutes().findingUsersActiveMinutes(
                    new int[][]{
                        {1, 1}, {2, 2}, {2, 3}
                    },
                    4
                )
            )
        );
    }

    public int[] findingUsersActiveMinutes(final int[][] logs, int k) {
        final Map<Integer, Set<Integer>> map = new HashMap<>(logs.length);
        for (final int[] log : logs) {
            map.putIfAbsent(log[0], new HashSet<>());
            map.get(log[0]).add(log[1]);
        }
        final int[] solution = new int[k];
        for (final Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            solution[entry.getValue().size() - 1]++;
        }
        return solution;
    }
}
