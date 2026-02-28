package BitManipulation.ConcatenatedBinary;
import java.util.*;

public class ConcatenatedBinary {
    public static int concatenatedBinary(int n) {
        long mod = 1000000007;
        long result = 0;
        int length = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                length++;
            }
            result = ((result << length) % mod + i) % mod;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(concatenatedBinary(n));
        sc.close();
    }
}