package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

//https://leetcode.com/problems/course-schedule-iv/
final class CourseSchedule4 {

     List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final int[] prerequisite : prerequisites) {
            adjacent.get(prerequisite[0]).add(prerequisite[1]);
        }
        final List<Boolean> solution = new ArrayList<>(queries.length);
        final Map<IntPair,Boolean> pairs = new HashMap<>();
        for (final int[] query : queries) {
            solution.add(this.dfs(query[1], query[0], adjacent, pairs));
        }
        return solution;
    }

    static class IntPair {
        final int from;
        final int to;

        IntPair(final int from, final int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof CourseSchedule4.IntPair)) return false;
            final CourseSchedule4.IntPair intPair = (CourseSchedule4.IntPair) o;
            return this.from == intPair.from && this.to == intPair.to;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.from, this.to);
        }
    }

    private boolean dfs(final int course, final int prerequisite, final Map<Integer, Set<Integer>> adjacent,final Map<IntPair,Boolean> cache) {
        final IntPair pair = new IntPair(prerequisite, course);
        if(cache.containsKey(pair)){
            return cache.get(pair);
        }
        if (!adjacent.containsKey(prerequisite)) {
            return false;
        }
        if (adjacent.get(prerequisite).contains(course)) {
            return true;
        }
        for (final Integer key : adjacent.get(prerequisite)) {
            if (this.dfs(course, key, adjacent,cache)) {
                cache.put(new IntPair(key,course),true);
                return true;
            } else{
                cache.put(new IntPair(key,course),false);
            }
        }
        cache.put(pair,false);
        return false;
    }
}
