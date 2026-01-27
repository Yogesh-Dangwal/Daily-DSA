package Graph.MinimumCostPathWithEdgeReversals;
import java.util.*;

public class MinimumCostPathWithEdgeReversals {

    public static int minCost(int n, int[][] edges) {
        List<int[]>[] graph = new ArrayList[n];
        List<int[]>[] reverseGraph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            reverseGraph[e[1]].add(new int[]{e[0], e[2]});
        }

        long[][] dist = new long[n][2];
        for (long[] d : dist) Arrays.fill(d, Long.MAX_VALUE);

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dist[0][0] = 0;
        pq.offer(new long[]{0, 0, 0});

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long cost = cur[0];
            int u = (int) cur[1];
            int state = (int) cur[2];

            if (cost > dist[u][state]) continue;

            for (int[] next : graph[u]) {
                int v = next[0];
                int w = next[1];
                if (dist[v][state] > cost + w) {
                    dist[v][state] = cost + w;
                    pq.offer(new long[]{dist[v][state], v, state});
                }
            }

            if (state == 0) {
                for (int[] prev : reverseGraph[u]) {
                    int v = prev[0];
                    int w = prev[1];
                    if (dist[v][1] > cost + 2L * w) {
                        dist[v][1] = cost + 2L * w;
                        pq.offer(new long[]{dist[v][1], v, 1});
                    }
                }
            }
        }

        long ans = Math.min(dist[n - 1][0], dist[n - 1][1]);
        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0,1,3},{3,1,1},{2,3,4},{0,2,2}};
        System.out.println(minCost(n, edges));
    }
}