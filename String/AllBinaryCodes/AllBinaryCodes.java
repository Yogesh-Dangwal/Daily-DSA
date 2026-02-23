import java.util.*;

public class AllBinaryCodes {

    public static boolean hasAllCodes(String s, int k) {
        if (k > s.length()) return false;

        Set<String> set = new HashSet<>();
        int total = 1 << k;

        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
            if (set.size() == total) return true;
        }

        return set.size() == total;
    }

    public static void main(String[] args) {
        System.out.println(hasAllCodes("00110110", 2));
        System.out.println(hasAllCodes("0110", 1));
        System.out.println(hasAllCodes("0110", 2));
    }
}