package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-duplicate-file-in-system/
public final class DuplicateFiles {

    public static void main(String[] args) {
        System.out.println(new DuplicateFiles().findDuplicate(
            new String[]{
                "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"
            }
        ));
    }

    public List<List<String>> findDuplicate(String[] paths) {
        final Map<String, List<String>> map = new HashMap<>();
        final List<List<String>> solution = new ArrayList<>();
        for (final String path : paths) {
            final String[] parts = path.split(" ");
            final String dir = parts[0];
            for (int i = 1; i < parts.length; i++) {
                final String part = parts[i];
                final String[] split = part.split("\\(");
                final String currentPath = dir + "/" + split[0];
                final List<String> merge = map.merge(split[1],
                    new ArrayList<>(Collections.singletonList(currentPath)),
                    (oldS, newS) -> {
                        oldS.addAll(newS);
                        return oldS;
                    });
                if (merge.size() == 2) {
                    solution.add(merge);
                }
            }
        }
        return solution;
    }
}
