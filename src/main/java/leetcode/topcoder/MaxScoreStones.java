package leetcode.topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class MaxScoreStones {

    public static void main(String[] args) {
        System.out.println(new MaxScoreStones().maximumScore(4, 4, 6));
        System.out.println(new MaxScoreStones().maximumScore(2, 4, 6));
    }

    public int maximumScore(int a, int b, int c) {
        int cnt = 0;
        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a, b, c));
        Collections.sort(list);
        while (list.stream().filter(p -> p != 0).count() >= 2) {
            if (list.get(0) != 0) {
                list.set(0, list.get(0) - 1);
                list.set(2, list.get(2) - 1);
            } else{
                list.set(1, list.get(1) - 1);
                list.set(2, list.get(2) - 1);
            }
            cnt++;
            Collections.sort(list);
        }
        return cnt;
    }
}
