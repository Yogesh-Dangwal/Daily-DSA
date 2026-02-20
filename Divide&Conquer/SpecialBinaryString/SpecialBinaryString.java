import java.util.*;

public class SpecialBinaryString {

    public static String makeLargestSpecial(String s) {
        List<String> list = new ArrayList<>();
        int count = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;

            if (count == 0) {
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                list.add("1" + inner + "0");
                start = i + 1;
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : list) sb.append(str);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeLargestSpecial("11011000"));
        System.out.println(makeLargestSpecial("10"));
    }
}