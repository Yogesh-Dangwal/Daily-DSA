package SortedSquares;
import java.util.*;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                res[pos--] = leftSq;
                left++;
            } else {
                res[pos--] = rightSq;
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        System.out.println("Sorted Squares: " + Arrays.toString(result));
    }
}