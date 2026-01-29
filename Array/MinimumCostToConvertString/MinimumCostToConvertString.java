package Array.MinimumCostToConvertString;
public class MinimumCostToConvertString {

    public static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int INF = (int)1e9;
        int[][] dist = new int[26][26];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                dist[i][j] = (i == j) ? 0 : INF;
            }
        }

        for (int i = 0; i < original.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] < INF && dist[k][j] < INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        if (source.length() != target.length()) {
            return -1;
        }
        long totalCost = 0;

        for (int i = 0; i < source.length(); i++) {
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if (dist[u][v] == INF) {
                return -1;
            }
            totalCost += dist[u][v];
        }
        return totalCost;
    }
    public static void main(String[] args) {
        String source = "abc";
        String target = "bcd";
        char[] original = {'a', 'b', 'c', 'a'};
        char[] changed = {'b', 'c', 'd', 'c'};
        int[] cost = {1, 1, 1, 2};

        long result = minimumCost(source, target, original, changed, cost);
        System.out.println("Minimum Cost to Convert String: " + result);
    }
}