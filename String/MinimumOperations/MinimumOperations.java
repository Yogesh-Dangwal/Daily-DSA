import java.util.*;

public class MinimumOperations {

    public static int minOperations(String s, int k) {
        int n = s.length();
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        if (zeros == 0) return 0;
        if (k == 0) return -1;
        if (k % 2 == 0) {
            if (zeros % 2 != 0) return -1;
        }
        if (k > n) return -1;
        return zeros % k == 0 ? zeros / k : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(minOperations(s, k));
        sc.close();
    }
}