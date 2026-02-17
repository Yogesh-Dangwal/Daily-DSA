package MinimumPrefixRemoval;
public class MinimumPrefixRemoval {

    public static int minimumPrefixRemoval(int[] nums) {
        int n = nums.length;
        int i = n - 1;

        while (i > 0 && nums[i] > nums[i - 1]) {
            i--;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -1, 2, 3, 3, 4, 5};
        System.out.println(minimumPrefixRemoval(nums1));

        int[] nums2 = {4, 3, -2, -5};
        System.out.println(minimumPrefixRemoval(nums2));

        int[] nums3 = {1, 2, 3, 4};
        System.out.println(minimumPrefixRemoval(nums3));
    }
}