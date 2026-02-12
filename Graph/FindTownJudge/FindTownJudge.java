package Graph.FindTownJudge;
public class FindTownJudge {

    public static int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];

        for (int[] t : trust) {
            score[t[0]]--;
            score[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] trust1 = {{1,2}};
        int[][] trust2 = {{1,3},{2,3}};
        int[][] trust3 = {{1,3},{2,3},{3,1}};

        System.out.println(findJudge(2, trust1));
        System.out.println(findJudge(3, trust2));
        System.out.println(findJudge(3, trust3));
    }
}