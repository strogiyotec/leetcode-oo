package leetcode.oo.dp.backtracking;

import java.util.HashSet;
import java.util.Set;


/**
 * Tile possibilities.
 * See {@link <a href ="https://leetcode.com/problems/letter-tile-possibilities/">https://leetcode.com/problems/letter-tile-possibilities/</a>}.
 */
final class TilePossibilities {

    int numTilePossibilities(final String tiles) {
        final Set<String> set = new HashSet<>(16);
        this.calculate(tiles, new StringBuilder(16), set, new boolean[tiles.length()]);
        return set.size();
    }

    private void calculate(final String tiles, final StringBuilder builder, final Set<String> set, final boolean[] backtrack) {
        if (builder.length() != 0) {
            set.add(builder.toString());
            if (builder.length() >= tiles.length()) {
                return;
            }
        }
        for (int i = 0; i < tiles.length(); i++) {
            if (!backtrack[i]) {
                backtrack[i] = true;
                builder.append(tiles.charAt(i));
                this.calculate(tiles, builder, set, backtrack);
                builder.deleteCharAt(builder.length() - 1);
                backtrack[i] = false;
            }
        }
    }
}
