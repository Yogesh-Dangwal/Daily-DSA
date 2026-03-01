import java.util.*;

public class MinPartitions {
    public static int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int d = n.charAt(i) - '0';
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(minPartitions(n));
        sc.close();
    }
}