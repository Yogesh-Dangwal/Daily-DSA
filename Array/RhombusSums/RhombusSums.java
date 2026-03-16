package RhombusSums;
import java.util.*;

public class RhombusSums {

    public static int[] getBiggestThree(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                set.add(grid[i][j]);

                int maxSize = Math.min(Math.min(i, m - 1 - i), Math.min(j, n - 1 - j));

                for (int k = 1; k <= maxSize; k++) {

                    int sum = 0;

                    for (int t = 0; t < k; t++)
                        sum += grid[i - k + t][j + t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i + t][j + k - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i + k - t][j - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i - t][j - k + t];

                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());

        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = set.pollLast();
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {3,4,5,1,3},
                {3,3,4,2,3},
                {20,30,200,40,10},
                {1,5,5,4,1},
                {4,3,2,2,5}
        };

        int[] result = getBiggestThree(grid);

        System.out.println(Arrays.toString(result));
    }
}