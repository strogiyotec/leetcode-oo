package leetcode.oo.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/rank-teams-by-votes/
public final class RankTeams {

    public static void main(String[] args) {
        System.out.println(
            new RankTeams().rankTeams(
                new String[]{"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"}
            )
        );
    }

    public String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        final Map<Character, int[]> teamToVotes = new HashMap<>(votes.length);
        for (int i = 0; i < votes[0].length(); i++) {
            teamToVotes.putIfAbsent(votes[0].charAt(i), new int[votes[0].length()]);
        }
        for (int i = 0; i < votes.length; i++) {
            final String currentVote = votes[i];
            for (int j = 0; j < currentVote.length(); j++) {
                teamToVotes.get(currentVote.charAt(j))[j]++;
            }
        }
        final List<Character> list = new ArrayList<>(teamToVotes.keySet());
        list.sort(((Comparator<Character>) (o1, o2) -> {
            for (int i = 0; i < votes[0].length(); i++) {
                final int[] first = teamToVotes.get(o1);
                final int[] second = teamToVotes.get(o2);
                if (first[i] > second[i]) {
                    return 1;
                } else if (first[i] < second[i]) {
                    return -1;
                }
            }
            return o2 - o1;
        }).reversed());
        final StringBuilder builder = new StringBuilder(list.size());
        list.forEach(builder::append);
        return builder.toString();
    }
}
