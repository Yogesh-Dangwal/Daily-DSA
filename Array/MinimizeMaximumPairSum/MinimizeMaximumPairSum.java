package MinimizeMaximumPairSum;
import java.util.*;

public class MinimizeMaximumPairSum {

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int ans = 0;

        while (left < right) {
            ans = Math.max(ans, nums[left] + nums[right]);
            left++;
            right--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 3};
        System.out.println(minPairSum(nums)); // 7
    }
}