package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/positions-of-large-groups/
public final class PositionsLargeGroup {

    public static void main(String[] args) {
        System.out.println(new PositionsLargeGroup().largeGroupPositions(
            "abcdddeeeeaabbbcd"
        ));
    }

    public List<List<Integer>> largeGroupPositions(final String line) {
        final List<List<Integer>> solution = new ArrayList<>();
        int startIndex = 0;
        while(startIndex<line.length()){
            int nextIndex = startIndex;
            while(nextIndex<line.length() && line.charAt(startIndex) == line.charAt(nextIndex)){
                nextIndex++;
            }
            if(nextIndex-startIndex>=3){
                solution.add(List.of(startIndex,nextIndex-1));
            }
            startIndex = nextIndex;
        }
        solution.sort(Comparator.comparingInt(o -> o.get(0)));
        return solution;
    }
}
