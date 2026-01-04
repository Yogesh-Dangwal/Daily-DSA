package Array.FourDivisors;
public class FourDivisor {

    public static int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                ans += sum;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {21, 4, 7};
        System.out.println(sumFourDivisors(nums));
    }
}