package Stack.ExclusiveTime;
import java.util.*;

public class ExclusiveTime {

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prev = 0;

        for (String log : logs) {
            String[] p = log.split(":");
            int id = Integer.parseInt(p[0]);
            int time = Integer.parseInt(p[2]);

            if (p[1].equals("start")) {
                if (!stack.isEmpty()) res[stack.peek()] += time - prev;
                stack.push(id);
                prev = time;
            } else {
                res[stack.pop()] += time - prev + 1;
                prev = time + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> logs = Arrays.asList(
                "0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6"
        );

        int[] ans = exclusiveTime(n, logs);

        System.out.println(Arrays.toString(ans));
    }
}