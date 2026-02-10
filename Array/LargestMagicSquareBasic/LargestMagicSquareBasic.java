package LargestMagicSquareBasic;
public class LargestMagicSquareBasic {

    public static int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxSize = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 2; i + k <= m && j + k <= n; k++) {
                    if (isMagic(grid, i, j, k)) {
                        maxSize = Math.max(maxSize, k);
                    }
                }
            }
        }
        return maxSize;
    }

    private static boolean isMagic(int[][] grid, int r, int c, int k) {
        int target = 0;

        for (int j = c; j < c + k; j++) {
            target += grid[r][j];
        }

        for (int i = r; i < r + k; i++) {
            int sum = 0;
            for (int j = c; j < c + k; j++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }

        for (int j = c; j < c + k; j++) {
            int sum = 0;
            for (int i = r; i < r + k; i++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
            d2 += grid[r + i][c + k - 1 - i];
        }

        return d1 == target && d2 == target;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {7,1,4,5,6},
            {2,5,1,6,4},
            {1,5,4,3,2},
            {1,2,7,3,4}
        };

        System.out.println(largestMagicSquare(grid));
    }
}