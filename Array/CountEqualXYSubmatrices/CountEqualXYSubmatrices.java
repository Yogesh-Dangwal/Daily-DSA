package Array.CountEqualXYSubmatrices;
import java.util.*;

public class CountEqualXYSubmatrices {

    public static int numberOfSubmatrices(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] x = new int[m+1][n+1];
        int[][] y = new int[m+1][n+1];

        int ans = 0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){

                x[i][j] = x[i-1][j] + x[i][j-1] - x[i-1][j-1];
                y[i][j] = y[i-1][j] + y[i][j-1] - y[i-1][j-1];

                if(grid[i-1][j-1]=='X') x[i][j]++;
                if(grid[i-1][j-1]=='Y') y[i][j]++;

                if(x[i][j] > 0 && x[i][j] == y[i][j])
                    ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args){

        char[][] grid = {
                {'X','Y','.'},
                {'Y','.','.'}
        };

        System.out.println(numberOfSubmatrices(grid));
    }
}