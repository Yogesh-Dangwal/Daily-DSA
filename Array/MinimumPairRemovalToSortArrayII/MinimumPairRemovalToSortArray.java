package MinimumPairRemovalToSortArrayII;
import java.util.PriorityQueue;
public class MinimumPairRemovalToSortArray {

    private static class P {
        long sum;
        int idx;
        P(long s, int i) {
            sum = s;
            idx = i;
        }
    }

    public static int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = nums[i];

        boolean[] removed = new boolean[n];

        PriorityQueue<P> pq = new PriorityQueue<>(
            (a, b) -> a.sum == b.sum ? a.idx - b.idx : Long.compare(a.sum, b.sum)
        );

        int sorted = 0;
        for (int i = 1; i < n; i++) {
            pq.add(new P(arr[i - 1] + arr[i], i - 1));
            if (arr[i] >= arr[i - 1]) sorted++;
        }

        if (sorted == n - 1) return 0;

        int[] prev = new int[n];
        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }

        int remaining = n;

        while (remaining > 1) {
            P top = pq.poll();
            if (top == null) break;

            int left = top.idx;
            int right = next[left];

            if (right >= n || removed[left] || removed[right] ||
                arr[left] + arr[right] != top.sum)
                continue;

            int pre = prev[left];
            int nxt = next[right];

            if (arr[left] <= arr[right]) sorted--;
            if (pre != -1 && arr[pre] <= arr[left]) sorted--;
            if (nxt != n && arr[right] <= arr[nxt]) sorted--;

            arr[left] += arr[right];
            removed[right] = true;
            remaining--;

            if (pre != -1) {
                pq.add(new P(arr[pre] + arr[left], pre));
                if (arr[pre] <= arr[left]) sorted++;
            }

            if (nxt != n) {
                prev[nxt] = left;
                next[left] = nxt;
                pq.add(new P(arr[left] + arr[nxt], left));
                if (arr[left] <= arr[nxt]) sorted++;
            }

            if (sorted == remaining - 1)
                return n - remaining;
        }

        return n;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        System.out.println(minimumPairRemoval(nums));
    }
}