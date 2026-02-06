import java.util.*;

public class MinimumRemovalsToBalanceArray {

    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int maxKeep = 1;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxKeep = Math.max(maxKeep, right - left + 1);
        }

        return n - maxKeep;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 5};
        int k1 = 2;
        System.out.println("Output: " + minRemoval(nums1, k1));

        int[] nums2 = {1, 6, 2, 9};
        int k2 = 3;
        System.out.println("Output: " + minRemoval(nums2, k2));

        int[] nums3 = {4, 6};
        int k3 = 2;
        System.out.println("Output: " + minRemoval(nums3, k3));
    }
}