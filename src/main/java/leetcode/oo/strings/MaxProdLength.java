package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/maximum-product-of-word-lengths/
public final class MaxProdLength {

    public static void main(String[] args) {
        System.out.println(new MaxProdLength().maxProduct(
            new String[]{
                "edadc", "ebbfe", "aacdde", "dfe", "cb", "fddddff", "fabca", "adccac", "ece", "ccaf", "feba", "bcb", "edadc", "aea", "bacb", "acefa", "fcebffd", "dfeebca", "bedcbaa", "deaccc", "abedc", "dadff", "eef", "ddebbb", "abecab", "cd", "abdeee", "eedce", "deef", "dceaddd", "ced", "fbbf", "ba", "eefeda", "fb", "cddc", "adafbf", "dded", "aadbf", "caefbaf", "ccebf", "dbb", "ee", "dadcecc", "ddbcabb", "afeaa", "ec", "aad", "efde", "cbcda", "cdbdafd", "cddc", "ecaaa", "ae", "cfc", "bccac", "cdcc", "abbbf", "fcdface", "ddbcdc", "bfebb", "daed", "bc", "dc", "ecdfc", "eeb", "bb", "dad", "caecb", "fbe", "bbbc", "cacea", "dbc", "fbe", "bcfffbd", "aeda", "cff", "ddfc", "ea", "bdfd", "ccb", "cb", "ae", "ceabefa", "dcea", "cbaed", "bfedf", "fa", "ccd", "fece", "bceef", "acabca", "dafa", "fdeec", "dac", "cae", "adeeadb", "ecacc", "acfe", "de"
            }
        ));
    }

    public int maxProduct(final String[] words) {
        final List<Set<Character>> list = new ArrayList<>();
        for (final String word : words) {
            final Set<Character> set = new HashSet<>(word.length(), 1.0F);
            for (int i = 0; i < word.length(); i++) {
                set.add(word.charAt(i));
            }
            list.add(set);
        }
        int longest = 0;
        for (int i = 0; i < words.length; i++) {
            final Set<Character> first = list.get(i);
            for (int j = 0; j < words.length; j++) {
                if (j == i) {
                    continue;
                }
                final Set<Character> second = list.get(j);
                boolean hasDup = false;
                for (final Character character : first) {
                    if (second.contains(character)) {
                        hasDup = true;
                        break;
                    }
                }
                if (!hasDup) {
                    longest = Math.max(words[i].length() * words[j].length(), longest);
                }
            }
        }
        return longest;
    }
}
