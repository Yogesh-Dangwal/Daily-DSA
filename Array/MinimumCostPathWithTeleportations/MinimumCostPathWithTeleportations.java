package Array.MinimumCostPathWithTeleportations;
import java.util.*;

public class MinimumCostPathWithTeleportations {

    public static int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][][] dist = new int[m][n][k + 1];
        for (int[][] d1 : dist)
            for (int[] d2 : d1)
                Arrays.fill(d2, Integer.MAX_VALUE);

        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new int[]{grid[i][j], i, j});
        cells.sort(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[0][0][0] = 0;
        pq.offer(new int[]{0, 0, 0, 0});

        boolean[][] usedTeleportLayer = new boolean[k + 1][cells.size()];

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int cost = cur[0], x = cur[1], y = cur[2], used = cur[3];

            if (cost > dist[x][y][used]) continue;
            if (x == m - 1 && y == n - 1) return cost;

            if (y + 1 < n) {
                int newCost = cost + grid[x][y + 1];
                if (dist[x][y + 1][used] > newCost) {
                    dist[x][y + 1][used] = newCost;
                    pq.offer(new int[]{newCost, x, y + 1, used});
                }
            }

            if (x + 1 < m) {
                int newCost = cost + grid[x + 1][y];
                if (dist[x + 1][y][used] > newCost) {
                    dist[x + 1][y][used] = newCost;
                    pq.offer(new int[]{newCost, x + 1, y, used});
                }
            }

            if (used < k) {
                int val = grid[x][y];
                for (int i = 0; i < cells.size(); i++) {
                    if (cells.get(i)[0] > val) break;
                    if (!usedTeleportLayer[used][i]) {
                        int nx = cells.get(i)[1], ny = cells.get(i)[2];
                        if (dist[nx][ny][used + 1] > cost) {
                            dist[nx][ny][used + 1] = cost;
                            pq.offer(new int[]{cost, nx, ny, used + 1});
                        }
                        usedTeleportLayer[used][i] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,3},{2,5,4},{4,3,5}};
        int k = 2;
        System.out.println(minCost(grid, k));
    }
}