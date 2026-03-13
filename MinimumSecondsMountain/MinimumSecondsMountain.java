package MinimumSecondsMountain;

public class MinimumSecondsMountain {

    public static long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long)1e18;
        long ans = right;

        while (left <= right) {

            long mid = (left + right) / 2;

            if (can(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    static boolean can(long time, int h, int[] workers) {

        long total = 0;

        for (int t : workers) {

            long low = 0, high = h;

            while (low <= high) {

                long mid = (low + high) / 2;
                long cost = (long)t * mid * (mid + 1) / 2;

                if (cost <= time)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            total += high;

            if (total >= h)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int mountainHeight = 4;
        int[] workerTimes = {2,1,1};

        System.out.println(minNumberOfSeconds(mountainHeight, workerTimes));
    }
}