package Sorting.IntersectionOfTwoArrays;
import java.util.*;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}