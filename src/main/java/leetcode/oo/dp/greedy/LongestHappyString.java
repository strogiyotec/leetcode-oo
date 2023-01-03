package leetcode.oo.dp.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public final class LongestHappyString {

    public static void main(String[] args) {
        System.out.println(new LongestHappyString().longestDiverseString(
            0,0,7
        ));
        System.out.println(new LongestHappyString().longestDiverseString(
            0,8,11
        ));
        System.out.println(new LongestHappyString().longestDiverseString(
            1, 4, 5
        ));
        System.out.println(new LongestHappyString().longestDiverseString(
            7, 1, 0
        ));
        System.out.println(new LongestHappyString().longestDiverseString(
            1, 1, 7
        ));
    }

    public String longestDiverseString(int a, int b, int c) {
        final PriorityQueue<Entry> queue = new PriorityQueue<>(Comparator.<Entry>comparingInt(o -> o.cnt).reversed());
        if (a > 0) {
            queue.add(new Entry(a, 'a'));
        }
        if (b > 0) {
            queue.add(new Entry(b, 'b'));
        }
        if (c > 0) {
            queue.add(new Entry(c, 'c'));
        }
        final StringBuilder solution = new StringBuilder();
        while (queue.size() >= 2) {
            final Entry first = queue.poll();
            if (first.cnt >= 2) {
                solution.append(first.letter);
                solution.append(first.letter);
                first.cnt -= 2;
            } else {
                solution.append(first.letter);
                first.cnt--;
            }
            final Entry second = queue.poll();
            if (second.cnt >= 2 && second.cnt > first.cnt) {
                solution.append(second.letter);
                solution.append(second.letter);
                second.cnt -= 2;
            } else {
                solution.append(second.letter);
                second.cnt--;
            }
            if (second.cnt != 0) {
                queue.offer(second);
            }
            if (first.cnt != 0) {
                queue.offer(first);
            }
        }
        if (!queue.isEmpty()) {
            final Entry entry = queue.poll();
            if (solution.length() == 0 || solution.charAt(solution.length() - 1) != entry.letter) {
                solution.append(String.valueOf(entry.letter).repeat(Math.max(0, Math.min(2, entry.cnt))));
            }
        }
        return solution.toString();
    }

    static class Entry {
        int cnt;
        char letter;

        public Entry(final int cnt, final char letter) {
            this.cnt = cnt;
            this.letter = letter;
        }
    }

}
