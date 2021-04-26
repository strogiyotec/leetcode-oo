package leetcode.oo.map;

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
            cnt += left.tailSet(rating).size() * right.headSet(rating).size();
            cnt += left.headSet(rating).size() * right.tailSet(rating).size();
            left.add(rating);
        }
        return cnt;
    }
}
