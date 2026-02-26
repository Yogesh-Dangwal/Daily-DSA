import java.util.*;

public class BinaryStepsToOne {

    public static int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            
            if (bit + carry == 1) {
                steps += 2;
                carry = 1;
            } else {
                steps += 1;
            }
        }

        return steps + carry;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(numSteps(s));
        sc.close();
    }
}