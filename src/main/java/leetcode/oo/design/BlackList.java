package leetcode.oo.design;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://leetcode.com/problems/random-pick-with-blacklist/
public final class BlackList {

    public static void main(String[] args) {
        final BlackList blackList = new BlackList(4, new int[]{2});
        System.out.println(blackList.pick());
        System.out.println(blackList.pick());
        System.out.println(blackList.pick());
    }

    private final Deque<Integer> queue;

    public BlackList(int n, int[] blacklist) {
        final Set<Integer> collect = IntStream.range(0, n).boxed().collect(Collectors.toSet());
        for (final int number : blacklist) {
            collect.remove(number);
        }
        this.queue = new ArrayDeque<>(collect.size());
        for (final Integer number : collect) {
            this.queue.addFirst(number);
        }
    }

    public int pick() {
        final Integer last = this.queue.removeLast();
        this.queue.addFirst(last);
        return last;
    }
}
