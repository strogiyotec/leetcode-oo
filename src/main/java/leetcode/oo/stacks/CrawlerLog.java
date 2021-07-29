package leetcode.oo.stacks;

//https://leetcode.com/problems/crawler-log-folder/
public final class CrawlerLog {

    public static void main(String[] args) {
        System.out.println(new CrawlerLog().minOperations(
            new String[]{
                "d1/", "d2/", "../", "d21/", "./"
            }
        ));
    }
    public int minOperations(final String[] logs) {
        int cnt = 0;
        for (final String log : logs) {
            if (log.equals("./")) {
                continue;
            }
             if (log.equals("../")) {
                cnt = Math.max(0, cnt - 1);
            } else{
                 cnt++;
             }
        }
        return cnt;
    }
}
