package Backtracking.KthHappyString;
public class KthHappyString {

    static int count = 0;
    static String ans = "";

    public static String getHappyString(int n, int k) {

        dfs(n, k, new StringBuilder());

        return ans;
    }

    static void dfs(int n, int k, StringBuilder sb) {

        if (sb.length() == n) {

            count++;

            if (count == k) {
                ans = sb.toString();
            }

            return;
        }

        char[] arr = {'a','b','c'};

        for (char c : arr) {

            if (sb.length() > 0 && sb.charAt(sb.length()-1) == c)
                continue;

            sb.append(c);

            dfs(n, k, sb);

            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {

        int n = 3;
        int k = 9;

        System.out.println(getHappyString(n,k));
    }
}