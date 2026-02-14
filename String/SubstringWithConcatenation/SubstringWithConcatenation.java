package String.SubstringWithConcatenation;
import java.util.*;

public class SubstringWithConcatenation {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || words.length == 0) return res;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) return res;

        Map<String, Integer> target = new HashMap<>();
        for (String w : words) {
            target.put(w, target.getOrDefault(w, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, count = 0;
            Map<String, Integer> window = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);

                if (target.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > target.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount) {
                        res.add(left);
                    }
                } else {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] w1 = {"foo", "bar"};
        System.out.println(findSubstring(s1, w1));

        String s2 = "wordgoodgoodgoodbestword";
        String[] w2 = {"word","good","best","word"};
        System.out.println(findSubstring(s2, w2));

        String s3 = "barfoofoobarthefoobarman";
        String[] w3 = {"bar","foo","the"};
        System.out.println(findSubstring(s3, w3));
    }
}