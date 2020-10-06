package leetcode.oo.window;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Dna sequence.
 * See {@link <a href ="https://leetcode.com/problems/repeated-dna-sequences/">https://leetcode.com/problems/repeated-dna-sequences/</a>}
 */
final class DnaSeq {

    List<String> findRepeatedDnaSequences(final String dna) {
        final Map<String, Integer> cnt = new HashMap<>(16);
        for (int i = 0; i + 9 < dna.length(); i++) {
            cnt.merge(dna.substring(i, i + 10), 1, Integer::sum);
        }
        return cnt.entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}
