package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/pyramid-transition-matrix/
final class PyramidTransitionMatrix {

    public boolean pyramidTransition(final String bottom, final List<String> allowed) {
        final Map<String, List<Character>> map = new HashMap<>(allowed.size() << 1);
        for (final String s : allowed) {
            map.computeIfAbsent(s.substring(0, 2), s1 -> new ArrayList<>()).add(s.charAt(2));
        }
        final List<Character> level = new ArrayList<>(bottom.length() + 1);
        for (int i = 0; i < bottom.length(); i++) {
            level.add(bottom.charAt(i));
        }
        return this.dfs(map, bottom, "", 1);
    }

    private boolean dfs(final Map<String, List<Character>> map, final String from, final String to, final int index) {
        if (from.length() == 1) {
            return true;
        }
        if (from.length() - 1 == to.length()){
            return this.dfs(map,to,"",1);
        }
        final String prefix = from.substring(index-1,index+1);
        if(!map.containsKey(prefix)){
            return false;
        }
        for (final Character c : map.get(prefix)) {
            if(this.dfs(map,from,to+c,index+1)){
                return true;
            }
        }
        return false;
    }

}
