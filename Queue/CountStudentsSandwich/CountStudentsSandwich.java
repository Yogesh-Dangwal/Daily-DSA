package Queue.CountStudentsSandwich;
import java.util.*;

public class CountStudentsSandwich {

    public static int countStudents(int[] students, int[] sandwiches) {
        int zero = 0, one = 0;

        for (int s : students) {
            if (s == 0) zero++;
            else one++;
        }

        for (int s : sandwiches) {
            if (s == 0) {
                if (zero == 0) return one;
                zero--;
            } else {
                if (one == 0) return zero;
                one--;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] students = new int[n];
        int[] sandwiches = new int[n];

        System.out.println("Enter students preferences (0 or 1):");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        System.out.println("Enter sandwiches stack (0 or 1):");
        for (int i = 0; i < n; i++) {
            sandwiches[i] = sc.nextInt();
        }

        int result = countStudents(students, sandwiches);

        System.out.println("Students unable to eat: " + result);

        sc.close();
    }
}