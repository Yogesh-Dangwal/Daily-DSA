package Array.MaximumMatrixsum;
public class MaximumMatrixSum {

    public static long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minAbs = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];

                if (val < 0) {
                    negativeCount++;
                }

                int absVal = Math.abs(val);
                sum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }

        if (negativeCount % 2 == 0) {
            return sum;
        } else {
            return sum - 2L * minAbs;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, -1},
            {-1, 1}
        };

        System.out.println(maxMatrixSum(matrix));
    }
}