package Sorting.ReductionOperations;
import java.util.*;

public class ReductionOperations {

    public static int reductionOperations(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int ops = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                ops += i;
            }
        }

        return ops;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3};

        System.out.println(reductionOperations(nums));
    }
}