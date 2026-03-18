package CountSubmatrices;

public class CountSubmatrices {

    public static int countSubmatrices(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] pref = new int[m+1][n+1];

        int ans = 0;

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                pref[i][j] = grid[i-1][j-1]
                           + pref[i-1][j]
                           + pref[i][j-1]
                           - pref[i-1][j-1];

                if (pref[i][j] <= k)
                    ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {7,6,3},
                {6,6,1}
        };

        int k = 18;

        System.out.println(countSubmatrices(grid,k));
    }
}