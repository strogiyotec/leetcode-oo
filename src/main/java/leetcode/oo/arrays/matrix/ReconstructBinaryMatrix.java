package leetcode.oo.arrays.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/
public final class ReconstructBinaryMatrix {

    public static void main(String[] args) {
        System.out.println(new ReconstructBinaryMatrix().reconstructMatrix(
            5, 5, new int[]{2,1,2,0,1,0,1,2,0,1}
        ));
    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] sums) {
        final List<List<Integer>> solution = List.of(
            new ArrayList<>(sums.length),
            new ArrayList<>(sums.length)
        );
        for (final int colSum : sums) {
            switch (colSum) {
                case 0:
                    solution.get(0).add(0);
                    solution.get(1).add(0);
                    break;

                case 1:
                    if(upper == 0 && lower == 0){
                        return Collections.emptyList();
                    }
                    if (upper > lower) {
                        solution.get(0).add(1);
                        upper--;
                        solution.get(1).add(0);
                    } else  {
                        solution.get(1).add(1);
                        lower--;
                        solution.get(0).add(0);
                    }
                    break;

                case 2:
                    if (upper == 0 || lower == 0) {
                        return Collections.emptyList();
                    }
                    solution.get(0).add(1);
                    solution.get(1).add(1);
                    upper--;
                    lower--;
                    break;
            }
        }
        if(upper !=0 || lower !=0){
            return Collections.emptyList();
        }
        return solution;
    }
}
