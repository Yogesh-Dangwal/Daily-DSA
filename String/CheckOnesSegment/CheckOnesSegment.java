import java.util.*;

public class CheckOnesSegment {

    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkOnesSegment(s));
        sc.close();
    }
}