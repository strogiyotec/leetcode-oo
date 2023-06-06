package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/stone-game-iv/description/
public final class StoneGame4 {

    final Map<Integer, Boolean> cache = new HashMap<>();

    public boolean winnerSquareGame(int amount) {
        return this.nextPlayerWon(amount);
    }

    private boolean nextPlayerWon(int amount) {
        if (amount == 0) {
            return false;
        }
        if (this.cache.containsKey(amount)) {
            return this.cache.get(amount);
        }
        boolean currentPlayerWon = false;
        for (int i = 1; i * i <= amount; i++) {
            if (!this.nextPlayerWon(amount - i * i)) {
                currentPlayerWon = true;
                this.cache.put(amount, true);
                break;
            }
        }
        this.cache.put(amount, currentPlayerWon);
        return currentPlayerWon;
    }

}
