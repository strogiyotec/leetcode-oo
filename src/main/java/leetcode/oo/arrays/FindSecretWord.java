package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/guess-the-word/
public final class FindSecretWord {

    public static void main(String[] args) {
        new FindSecretWord().findSecretWord(
            new String[]{
                "acckzz", "ccbazz", "eiowzz", "abcczz"
            },
            new Master("acckzz")
        );
    }

    public void findSecretWord(final String[] wordlist, Master master) {
         List<String> list = new ArrayList<>(Arrays.asList(wordlist));
        Collections.shuffle(list);
        for (int i = 0; i < 10; i++) {
            final List<String> temp = new ArrayList<>(list.size());
            final String guess = list.get(0);
            final int matched = master.guess(guess);
            if (matched == 6) {
                System.out.println("Found");
                return;
            } else {
                for (int j = 1; j < list.size(); j++) {
                    if (this.matched(guess, list.get(j)) == matched) {
                        temp.add(list.get(j));
                    }
                }
            }
            list = temp;
        }
    }

    private int matched(final String guess, final String next) {
        int cnt = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == next.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private static class Master {

        private final String secret;

        private Master(final String secret) {
            this.secret = secret;
        }

        public int guess(String word) {
            int cnt = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == this.secret.charAt(i)) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                return -1;
            }
            return cnt;
        }
    }
}
