package leetcode.oo.dp;

import java.util.LinkedList;
import java.util.List;

//Lexicographical Numbers
public final class LexNumber {

    public static void main(String[] args) {
        System.out.println(new LexNumber().lexicalOrder(13));
    }

    public List<Integer> lexicalOrder(final int n) {
        final List<Integer> list = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            this.dfs(list, i, n);
        }
        return list;
    }

    private void dfs(final List<Integer> list, final int current, final int limit) {
        if (current > limit) {
            return;
        }
        list.add(current);
        for (int i = 0; i < 10; i++) {
            this.dfs(list, current * 10 + i, limit);
        }
    }
}
