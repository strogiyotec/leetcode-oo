package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;


/**
 * Ransom note.
 * See {@link <a href ="https://leetcode.com/problems/ransom-note/">https://leetcode.com/problems/ransom-note/</a>}.
 */
final class RansomNote {

    boolean canConstruct(final String ransomNote, final String magazine) {
        final Map<Character, Integer> noteCnt = new HashMap<>(ransomNote.length());
        for (int i = 0; i < ransomNote.length(); i++) {
            noteCnt.merge(ransomNote.charAt(i), 1, Integer::sum);
        }
        final Map<Character, Integer> magazineCnt = new HashMap<>(magazine.length());
        for (int i = 0; i < magazine.length(); i++) {
            magazineCnt.merge(magazine.charAt(i), 1, Integer::sum);
        }
        for (final Map.Entry<Character, Integer> entry : noteCnt.entrySet()) {
            if (magazineCnt.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
