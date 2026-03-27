import java.util.*;
public class MinFlipsAlternating {

    public static int minFlips(String s) {
        int n = s.length();
        String t = s + s;
        int ans = Integer.MAX_VALUE;

        int diff1 = 0, diff2 = 0;
        int l = 0;

        for (int r = 0; r < t.length(); r++) {

            char e1 = (r % 2 == 0) ? '0' : '1';
            char e2 = (r % 2 == 0) ? '1' : '0';

            if (t.charAt(r) != e1) diff1++;
            if (t.charAt(r) != e2) diff2++;

            if (r - l + 1 > n) {
                char le1 = (l % 2 == 0) ? '0' : '1';
                char le2 = (l % 2 == 0) ? '1' : '0';

                if (t.charAt(l) != le1) diff1--;
                if (t.charAt(l) != le2) diff2--;
                l++;
            }

            if (r - l + 1 == n) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minFlips(s));
        sc.close();
    }
}