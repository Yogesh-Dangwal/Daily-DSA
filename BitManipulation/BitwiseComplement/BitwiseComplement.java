package BitManipulation.BitwiseComplement;
import java.util.*;

public class BitwiseComplement {

    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;

        int mask = 0;
        int temp = n;

        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return mask ^ n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Complement: " + bitwiseComplement(n));

        sc.close();
    }
}