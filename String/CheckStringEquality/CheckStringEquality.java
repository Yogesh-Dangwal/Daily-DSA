package String.CheckStringEquality;
import java.util.*;

public class CheckStringEquality {

    public static boolean canBeEqual(String s1,String s2){

        char[] a={s1.charAt(0),s1.charAt(2)};
        char[] b={s1.charAt(1),s1.charAt(3)};

        char[] c={s2.charAt(0),s2.charAt(2)};
        char[] d={s2.charAt(1),s2.charAt(3)};

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(a,c) && Arrays.equals(b,d);
    }

    public static void main(String[] args){

        String s1="abcd";
        String s2="cdab";

        System.out.println(canBeEqual(s1,s2));
    }
}