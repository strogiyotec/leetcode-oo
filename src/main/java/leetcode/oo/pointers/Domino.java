package leetcode.oo.pointers;

//https://leetcode.com/problems/push-dominoes/
public final class Domino {

    public static void main(String[] args) {
        System.out.println(new Domino().pushDominoes(
            "...RL....R.L.L........RR......L....R.L.....R.L..RL....R....R......R.......................LR.R..L.R."
        ));
        System.out.println(new Domino().pushDominoes(
            "R..L..R..LR.R.R....."
        ));
        System.out.println(new Domino().pushDominoes(
            "R.R.L"
        ));
        System.out.println(new Domino().pushDominoes(
            "RR.L"
        ));
    }

    public String pushDominoes(final String dominoes) {
        final StringBuilder solution = new StringBuilder(dominoes);
        int to = 0;
        int from = 0;
        while (to < dominoes.length()) {
            if (dominoes.charAt(to) == 'L') {
                for (int i = from; i < to; i++) {
                    solution.setCharAt(i, 'L');
                }
                from = to;
            } else if (dominoes.charAt(to) == 'R') {
                int firstLeft = to + 1;
                while (firstLeft < dominoes.length() && dominoes.charAt(firstLeft) != 'L') {
                    if (dominoes.charAt(firstLeft) == 'R') {
                        for (int i = to; i < firstLeft; i++) {
                            solution.setCharAt(i, 'R');
                        }
                        to = firstLeft;
                    }
                    firstLeft++;
                }
                if (firstLeft == dominoes.length()) {
                    for (int i = to; i < firstLeft; i++) {
                        solution.setCharAt(i, 'R');
                    }
                    break;
                } else {
                    int moveRight = to + 1;
                    int moveLeft = firstLeft - 1;
                    while (solution.charAt(moveLeft) == '.' && solution.charAt(moveRight) == '.') {
                        if (moveLeft == moveRight) {
                            break;
                        }
                        solution.setCharAt(moveRight++, 'R');
                        solution.setCharAt(moveLeft--, 'L');

                    }
                    from = firstLeft;
                    to = firstLeft;
                }
            }
            to++;
        }
        return solution.toString();
    }
}
