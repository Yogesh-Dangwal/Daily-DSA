package Array.MaximumNumberOfWordsInSentences;
public class MaximumNumberOfWordsInSentences {

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String s : sentences) {
            int count = 1;
            for (char c : s.toCharArray()) {
                if (c == ' ') count++;
            }
            maxWords = Math.max(maxWords, count);
        }

        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        System.out.println(mostWordsFound(sentences));
    }
}