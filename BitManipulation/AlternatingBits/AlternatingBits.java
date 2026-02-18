package BitManipulation.AlternatingBits;
public class AlternatingBits {

    public static boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;

        while (n > 0) {
            int curr = n & 1;
            if (curr == prev) return false;
            prev = curr;
            n >>= 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
    }
}