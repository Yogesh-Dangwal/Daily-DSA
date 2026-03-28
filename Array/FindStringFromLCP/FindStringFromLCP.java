package Array.FindStringFromLCP;
import java.util.*;

public class FindStringFromLCP {

    public static String findTheString(int[][] lcp){

        int n=lcp.length;

        char[] res=new char[n];

        Arrays.fill(res,'#');

        char cur='a';

        for(int i=0;i<n;i++){

            if(res[i]!='#')
                continue;

            if(cur>'z')
                return "";

            for(int j=i;j<n;j++){

                if(lcp[i][j]>0)
                    res[j]=cur;
            }

            cur++;
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                int k=0;

                while(i+k<n && j+k<n && res[i+k]==res[j+k])
                    k++;

                if(k!=lcp[i][j])
                    return "";
            }
        }

        return new String(res);
    }

    public static void main(String[] args){

        int[][] lcp={
                {4,0,2,0},
                {0,3,0,1},
                {2,0,2,0},
                {0,1,0,1}
        };

        System.out.println(findTheString(lcp));
    }
}