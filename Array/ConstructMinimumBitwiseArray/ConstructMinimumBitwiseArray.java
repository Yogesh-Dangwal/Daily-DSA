package Array.ConstructMinimumBitwiseArray;
import java.util.*;

public class ConstructMinimumBitwiseArray {

    public static int[] minBitwiseArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if ((num & (num - 1)) == 0) {
                ans[i] = -1;
                continue;
            }

            int bit = 0;
            while (((num >> bit) & 1) == 1) {
                bit++;
            }

            ans[i] = num ^ (1 << bit);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7};
        System.out.println(Arrays.toString(minBitwiseArray(nums)));
    }
}