import java.util.*;
public class MaximizeAreaOfSquareHoleInGrid {

    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxH = maxConsecutive(hBars);
        int maxV = maxConsecutive(vBars);

        int side = Math.min(maxH, maxV);
        return side * side;
    }

    private static int maxConsecutive(int[] bars) {
        Arrays.sort(bars);
        int max = 1;
        int curr = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                curr++;
            } else {
                curr = 1;
            }
            max = Math.max(max, curr);
        }

        return max + 1;
    }

    public static void main(String[] args) {
        int n = 2, m = 1;
        int[] hBars = {2, 3};
        int[] vBars = {2};

        System.out.println(maximizeSquareHoleArea(n, m, hBars, vBars)); // 4
    }
}