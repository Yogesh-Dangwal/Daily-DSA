package Tree.FancySequence;

import java.util.HashMap;

public class FancySequence {
    private HashMap<Integer, Long> map;
    private long add;
    private long mul;
    private int mod;

    public FancySequence() {
        map = new HashMap<>();
        add = 0;
        mul = 1;
        mod = 1000000007;
    }

    public void append(int val) {
        long v = (val - add + mod) % mod * modInverse(mul, mod) % mod;
        map.put(map.size(), v);
    }

    public void addAll(int inc) {
        add = (add + inc) % mod;
    }

    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }

    public int getIndex(int idx) {
        if (!map.containsKey(idx)) {
            return -1;
        }
        long v = (map.get(idx) * mul + add) % mod;
        return (int) v;
    }

    private long modInverse(long a, int m) {
        long m0 = m, t, q;
        long x0 = 0, x1 = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            q = a / m;
            t = m;

            m = (int)(a % m);
            a = t;

            t = x0;

            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0)
            x1 += m0;

        return x1;
    }
}