package DynamicProgramming.NumberofWaysToPaintGrid;
public class NumberOfWaysToPaint {

    public static int numOfWays(int n) {
        int MOD = 1000000007;

        long same = 6;
        long diff = 6;

        for (int i = 2; i <= n; i++) {
            long newSame = (same * 3 + diff * 2) % MOD;
            long newDiff = (same * 2 + diff * 2) % MOD;

            same = newSame;
            diff = newDiff;
        }

        return (int) ((same + diff) % MOD);
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(numOfWays(n));

        n = 5000;
        System.out.println(numOfWays(n));
    }
}