package leetcode.oo.map;

import java.util.NavigableSet;
import java.util.TreeSet;

//https://leetcode.com/problems/count-number-of-teams/
final class CountSolders {

    int numTeams(final int[] ratings) {
        final TreeSet<Integer> right = new TreeSet<>();
        final TreeSet<Integer> left = new TreeSet<>();
        for (final int rating : ratings) {
            right.add(rating);
        }
        int cnt = 0;
        for (final int rating : ratings) {
            right.remove(rating);
            cnt += this.biggerThan(left, rating) * this.smallerThan(right, rating);
            cnt += this.smallerThan(left, rating) * this.biggerThan(right, rating);
            left.add(rating);
        }
        return cnt;
    }

    private int biggerThan(final NavigableSet<Integer> set, final int num) {
        return set.tailSet(num).size();
    }

    private int smallerThan(final NavigableSet<Integer> set, final int num) {
        return set.headSet(num).size();
    }
}
