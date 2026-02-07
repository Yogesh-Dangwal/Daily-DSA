package MinimumDeletionsBalancedString;
public class MinimumDeletionsBalancedString {

    public static int minimumDeletions(String s) {
        int bCount = 0;
        int deletions = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else { // 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        String s1 = "aababbab";
        System.out.println("Output: " + minimumDeletions(s1));

        String s2 = "bbaaaaabb";
        System.out.println("Output: " + minimumDeletions(s2));
    }
}