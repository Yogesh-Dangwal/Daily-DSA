package String.MinimumAlternatingChanges;
import java.util.*;

public class MinimumAlternatingChanges {

    public static int minOperations(String s) {
        int a = 0, b = 0;

        for (int i = 0; i < s.length(); i++) {
            char e1 = (i % 2 == 0) ? '0' : '1';
            char e2 = (i % 2 == 0) ? '1' : '0';

            if (s.charAt(i) != e1) a++;
            if (s.charAt(i) != e2) b++;
        }

        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(minOperations(s));
        sc.close();
    }
}