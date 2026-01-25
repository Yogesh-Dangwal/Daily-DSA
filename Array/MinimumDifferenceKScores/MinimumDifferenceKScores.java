package Array.MinimumDifferenceKScores;
import java.util.*;

public class MinimumDifferenceKScores {

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i + k - 1 < nums.length; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }
}