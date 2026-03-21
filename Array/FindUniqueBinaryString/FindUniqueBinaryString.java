package FindUniqueBinaryString;

public class FindUniqueBinaryString {

    public static String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        char[] res = new char[n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i].charAt(i) == '0' ? '1' : '0';
        }

        return new String(res);
    }

    public static void main(String[] args) {
        String[] nums = {"01","10"};
        System.out.println(findDifferentBinaryString(nums));
    }
}