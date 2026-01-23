package Array.MajorityElement;
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int freq = 0, res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                res = nums[i];
            }

            if (nums[i] == res) {
                freq++;
            } else {
                freq--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // 2
    }
}