package MinimumPairRemovalToSortArrayI;
public class MinimumPairRemovalToSortArrayI {

    public static int minimumPairRemoval(int[] nums) {
        int operations = 0;

        while (!isNonDecreasing(nums)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            int[] newArr = new int[nums.length - 1];
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i == index) {
                    newArr[k++] = nums[i] + nums[i + 1];
                    i++;
                } else {
                    newArr[k++] = nums[i];
                }
            }

            nums = newArr;
            operations++;
        }

        return operations;
    }

    private static boolean isNonDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        System.out.println(minimumPairRemoval(nums)); // 2
    }
}