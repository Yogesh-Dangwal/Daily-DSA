package Array.ConstructMinimumBitwiseArrayII;
import java.util.*;

public class ConstructMinimumBitwiseArrayII {

    public static int[] minBitwiseArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (n != 2)
                ans[i] = n - ((n + 1) & (-n - 1)) / 2;
            else
                ans[i] = -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, 7};
        System.out.println(Arrays.toString(minBitwiseArray(nums1)));

        int[] nums2 = {11, 13, 31};
        System.out.println(Arrays.toString(minBitwiseArray(nums2)));
    }
}