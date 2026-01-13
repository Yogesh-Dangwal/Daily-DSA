package Array.SeparateSquares;
public class SeparateSquares {

    public static double separateSquares(int[][] squares) {
        double low = 0, high = 1e9;
        double totalArea = 0;

        for (int[] sq : squares) {
            totalArea += (double) sq[2] * sq[2];
        }

        double half = totalArea / 2.0;

        for (int i = 0; i < 100; i++) {
            double mid = (low + high) / 2.0;
            double below = areaBelow(squares, mid);

            if (below < half) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private static double areaBelow(int[][] squares, double y) {
        double area = 0;

        for (int[] sq : squares) {
            double bottom = sq[1];
            double top = sq[1] + sq[2];
            double side = sq[2];

            if (y <= bottom) {
                continue;
            } else if (y >= top) {
                area += side * side;
            } else {
                area += (y - bottom) * side;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        int[][] squares1 = {{0, 0, 1}, {2, 2, 1}};
        System.out.printf("%.5f%n", separateSquares(squares1));

        int[][] squares2 = {{0, 0, 2}, {1, 1, 1}};
        System.out.printf("%.5f%n", separateSquares(squares2));
    }
}