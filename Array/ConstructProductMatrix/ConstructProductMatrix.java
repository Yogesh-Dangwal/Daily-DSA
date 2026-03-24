package ConstructProductMatrix;
import java.util.*;

public class ConstructProductMatrix {

    public static int[][] constructProductMatrix(int[][] grid){

        int n = grid.length;
        int m = grid[0].length;

        int mod = 12345;

        int size = n*m;

        long[] arr = new long[size];

        int idx=0;

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[idx++]=grid[i][j]%mod;

        long[] left=new long[size];
        long[] right=new long[size];

        left[0]=1;

        for(int i=1;i<size;i++)
            left[i]=(left[i-1]*arr[i-1])%mod;

        right[size-1]=1;

        for(int i=size-2;i>=0;i--)
            right[i]=(right[i+1]*arr[i+1])%mod;

        int[][] res=new int[n][m];

        idx=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                res[i][j]=(int)((left[idx]*right[idx])%mod);

                idx++;
            }
        }

        return res;
    }

    public static void main(String[] args){

        int[][] grid={
                {1,2},
                {3,4}
        };

        int[][] res=constructProductMatrix(grid);

        for(int[] row:res)
            System.out.println(Arrays.toString(row));
    }
}