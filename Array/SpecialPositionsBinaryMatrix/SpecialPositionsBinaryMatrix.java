package SpecialPositionsBinaryMatrix;

public class SpecialPositionsBinaryMatrix {

    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,0,0},
            {0,0,1},
            {1,0,0}
        };

        System.out.println(numSpecial(mat));
    }
}