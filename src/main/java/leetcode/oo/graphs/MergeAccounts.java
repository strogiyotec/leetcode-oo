package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

//https://leetcode.com/problems/accounts-merge/
final class MergeAccounts {

    List<List<String>> accountsMerge(List<List<String>> acts) {
        final Map<String, String> parents = new HashMap<>();
        final Map<String, String> owner = new HashMap<>();
        for (final List<String> act : acts) {
            for (final String s : act) {
                owner.put(s, act.get(0));
                parents.put(s, s);
            }
        }
        for (final List<String> act : acts) {
            final String parent = this.find(act.get(1), parents);
            for (int i = 2; i < act.size(); i++) {
                parents.put(this.find(act.get(i), parents), parent);
            }
        }
        final Map<String, TreeSet<String>> union = new HashMap<>();
        for (final List<String> act : acts) {
            final String parent = this.find(act.get(1), parents);
            if (!union.containsKey(parent)) {
                union.put(parent, new TreeSet<>());
            }
            for (int i = 1; i < act.size(); i++) {
                union.get(parent).add(act.get(i));
            }
        }
        final List<List<String>> solution = new ArrayList<>();
        for (final Map.Entry<String, TreeSet<String>> entry : union.entrySet()) {
            final List<String> list = new ArrayList<>(entry.getValue());
            list.add(0, owner.get(entry.getKey()));
            solution.add(list);
        }
        return solution;
    }

    private String find(String s, Map<String, String> p) {
        while (true) {
            if (s.equals(p.get(s))) {
                return s;
            }
            s = p.get(s);
        }
    }
}
