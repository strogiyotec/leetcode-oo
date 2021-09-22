package leetcode.oo.stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/process-tasks-using-servers/
public final class ProcessServers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProcessServers().assignTasks(
            new int[]{3, 3, 2},
            new int[]{1, 2, 3, 2, 1, 2}
        )));
    }

    public int[] assignTasks(final int[] servers, final int[] tasks) {
        final PriorityQueue<Server> freeServers = new PriorityQueue<>(Comparator.comparingInt(o -> o.weight));
        final PriorityQueue<Server> usedServers = new PriorityQueue<>(Comparator.comparingInt(o -> o.availableTime));
        for (int i = 0; i < servers.length; i++) {
            freeServers.offer(new Server(i, servers[i], 0));
        }
        final int[] solution = new int[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            final int task = tasks[i];
            while (!usedServers.isEmpty() && usedServers.peek().availableTime <= i) {
                freeServers.offer(usedServers.poll());
            }
            final Server poll = freeServers.poll();
            solution[i] = poll.index;
            usedServers.add(new Server(
                    poll.index,
                    poll.weight,
                    i + task
                )
            );
        }
        return solution;
    }

    @SuppressWarnings("ALL")
    static class Server {

        final int index;
        final int weight;
        int availableTime;

        public Server(final int index, final int weight, final int availableTime) {
            this.index = index;
            this.weight = weight;
            this.availableTime = availableTime;
        }
    }
}
