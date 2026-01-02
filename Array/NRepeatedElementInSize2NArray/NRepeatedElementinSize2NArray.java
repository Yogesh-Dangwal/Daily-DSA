package Array.NRepeatedElementInSize2NArray;
public class NRepeatedElementInSize2NArray {

    public static int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(repeatedNTimes(nums));
    }
}