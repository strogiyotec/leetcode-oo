package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/distant-barcodes/
public final class DistantBarcodes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DistantBarcodes().rearrangeBarcodes(
            new int[]{
                1,1,1,2,2,2
            }
        )));
    }

    public int[] rearrangeBarcodes(final int[] barcodes) {
        final Map<Integer, Integer> map = new HashMap<>(barcodes.length);
        for (final int barcode : barcodes) {
            map.merge(barcode, 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.<Integer>comparingInt(map::get).reversed());
        queue.addAll(map.keySet());
        final int[] solution = new int[barcodes.length];
        for (int i = 0; i < barcodes.length ; i += 2) {
            final int highest = queue.poll();
            solution[i] = highest;
            if(queue.isEmpty()){
                break;
            }
            final int secHighest = queue.poll();
            solution[i + 1] = secHighest;
            if (map.computeIfPresent(highest, (key, val) -> val - 1) == 0) {
                map.remove(highest);
            } else {
                queue.add(highest);
            }
            if (map.computeIfPresent(secHighest, (key, val) -> val - 1) == 0) {
                map.remove(secHighest);
            } else {
                queue.add(secHighest);
            }
        }
        return solution;
    }
}
