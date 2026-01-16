package Array.MaximumSquareAreaByRemovingFences;
import java.util.*;

public class MaximumSquareAreaByRemovingFences {

    static final int MOD = 1_000_000_007;

    public static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Set<Long> hDiff = getDiffs(hFences, m);
        Set<Long> vDiff = getDiffs(vFences, n);

        long maxSide = -1;
        for (long d : hDiff) {
            if (vDiff.contains(d)) {
                maxSide = Math.max(maxSide, d);
            }
        }

        if (maxSide == -1) return -1;
        return (int)((maxSide * maxSide) % MOD);
    }

    private static Set<Long> getDiffs(int[] fences, int limit) {
        int[] arr = new int[fences.length + 2];
        arr[0] = 1;
        arr[arr.length - 1] = limit;
        for (int i = 0; i < fences.length; i++) {
            arr[i + 1] = fences[i];
        }

        Arrays.sort(arr);
        Set<Long> diffs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diffs.add((long) arr[j] - arr[i]);
            }
        }
        return diffs;
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        int[] hFences = {2, 3};
        int[] vFences = {2};

        System.out.println(maximizeSquareArea(m, n, hFences, vFences)); // 4
    }
}