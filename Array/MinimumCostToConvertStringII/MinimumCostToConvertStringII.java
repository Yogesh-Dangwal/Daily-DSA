package MinimumCostToConvertStringII;
import java.util.*;

public class MinimumCostToConvertStringII {

    public static long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
        int n = source.length();
        Map<String, Integer> idMap = new HashMap<>();
        int id = 0;

        for (String s : original) if (!idMap.containsKey(s)) idMap.put(s, id++);
        for (String s : changed) if (!idMap.containsKey(s)) idMap.put(s, id++);

        int m = id;
        long INF = (long)1e18;
        long[][] dist = new long[m][m];

        for (long[] row : dist) Arrays.fill(row, INF);
        for (int i = 0; i < m; i++) dist[i][i] = 0;

        for (int i = 0; i < original.length; i++) {
            int u = idMap.get(original[i]);
            int v = idMap.get(changed[i]);
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        for (int k = 0; k < m; k++)
            for (int i = 0; i < m; i++)
                for (int j = 0; j < m; j++)
                    if (dist[i][k] < INF && dist[k][j] < INF)
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

        long[] dp = new long[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] == INF) continue;

            if (source.charAt(i) == target.charAt(i))
                dp[i + 1] = Math.min(dp[i + 1], dp[i]);

            for (String s : idMap.keySet()) {
                int len = s.length();
                if (i + len > n) continue;

                String subSource = source.substring(i, i + len);
                String subTarget = target.substring(i, i + len);

                if (!idMap.containsKey(subSource) || !idMap.containsKey(subTarget)) continue;

                long c = dist[idMap.get(subSource)][idMap.get(subTarget)];
                if (c < INF) dp[i + len] = Math.min(dp[i + len], dp[i] + c);
            }
        }

        return dp[n] == INF ? -1 : dp[n];
    }

    public static void main(String[] args) {
        String source = "abcdefgh";
        String target = "acdeeghh";
        String[] original = {"bcd","fgh","thh"};
        String[] changed = {"cde","thh","ghh"};
        int[] cost = {1,3,5};

        System.out.println(minimumCost(source, target, original, changed, cost)); // 9
    }
}