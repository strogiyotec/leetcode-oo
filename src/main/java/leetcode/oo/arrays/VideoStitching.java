package leetcode.oo.arrays;

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
        int start = 0;
        int max = -1;
        int cnt = 0;
        while (start < time) {
            boolean found = false;
            for (final int[] clip : clips) {
                if (clip[0] <= start && clip[1] > max) {
                    found = true;
                    max = clip[1];
                }
            }
            if (!found) {
                return -1;
            }
            cnt++;
            start = max;
        }
        return cnt;
    }
}
