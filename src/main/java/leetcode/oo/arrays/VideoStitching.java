package leetcode.oo.arrays;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/video-stitching/
public final class VideoStitching {

    public static void main(String[] args) {
        System.out.println(
            new VideoStitching().videoStitching(
                new int[][]{
                    {0, 1}, {1, 2}
                },
                5
            )
        );
        System.out.println(
            new VideoStitching().videoStitching(
                new int[][]{
                    {0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}
                },
                10
            )
        );
    }

    public int videoStitching(final int[][] clips, final int time) {
        Set<AbstractMap.SimpleEntry<Integer, Integer>> pairs = new HashSet<>(clips.length << 1);
        for (final int[] clip : clips) {
            pairs.add(new AbstractMap.SimpleEntry<>(clip[0], clip[1]));
        }
        int cnt = 0;
        int max = -1;
        int start = 0;
        while (start < time) {
            boolean found = false;
            final Set<AbstractMap.SimpleEntry<Integer, Integer>> temp = new HashSet<>(clips.length);
            for (final AbstractMap.SimpleEntry<Integer, Integer> clip : pairs) {
                if (clip.getKey() <= start && clip.getValue() > start) {
                    max = Math.max(max, clip.getValue());
                    found = true;
                } else {
                    temp.add(clip);
                }
            }
            if (!found) {
                return -1;
            }
            cnt++;
            start = max;
            pairs = temp;
        }
        return cnt;
    }
}
