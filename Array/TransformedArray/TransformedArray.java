package TransformedArray;
import java.util.Arrays;

public class TransformedArray {

    public static int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                int newIndex = ((i + nums[i]) % n + n) % n;
                result[i] = nums[newIndex];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, -2, 1, 1};
        int[] result = constructTransformedArray(nums);
        System.out.println("Transformed Array: " + Arrays.toString(result));
    }
}