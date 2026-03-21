package ReverseSubmatrix;
import java.util.*;

public class ReverseSubmatrix {

    public static int[][] reverseSubmatrix(int[][] grid,int x,int y,int k){

        int t=x;
        int b=x+k-1;

        while(t<b){

            for(int j=y;j<y+k;j++){

                int temp=grid[t][j];
                grid[t][j]=grid[b][j];
                grid[b][j]=temp;
            }

            t++;
            b--;
        }

        return grid;
    }

    public static void main(String[] args){

        int[][] grid={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int x=1;
        int y=0;
        int k=3;

        int[][] res=reverseSubmatrix(grid,x,y,k);

        for(int[] row:res)
            System.out.println(Arrays.toString(row));
    }
}