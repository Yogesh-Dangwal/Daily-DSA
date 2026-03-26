package EqualSumGridPartition2;

public class EqualSumGridPartition2 {

    public static boolean canPartitionGrid(int[][] grid){

        int m=grid.length;
        int n=grid[0].length;

        long total=0;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                total+=grid[i][j];

        long top=0;

        for(int i=0;i<m-1;i++){

            for(int j=0;j<n;j++)
                top+=grid[i][j];

            long bottom=total-top;

            if(check(grid,i,true,top,bottom))
                return true;
        }

        long left=0;

        for(int j=0;j<n-1;j++){

            for(int i=0;i<m;i++)
                left+=grid[i][j];

            long right=total-left;

            if(check(grid,j,false,left,right))
                return true;
        }

        return false;
    }

    static boolean check(int[][] grid,int cut,boolean horizontal,long a,long b){

        if(a==b)
            return true;

        long diff=Math.abs(a-b);

        int m=grid.length;
        int n=grid[0].length;

        if(a>b){

            if(horizontal){

                for(int j=0;j<n;j++)
                    if(grid[cut][j]==diff)
                        return true;

            }else{

                for(int i=0;i<m;i++)
                    if(grid[i][cut]==diff)
                        return true;
            }

        }else{

            if(horizontal){

                for(int j=0;j<n;j++)
                    if(grid[cut+1][j]==diff)
                        return true;

            }else{

                for(int i=0;i<m;i++)
                    if(grid[i][cut+1]==diff)
                        return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        int[][] grid={
                {1,2},
                {3,4}
        };

        System.out.println(canPartitionGrid(grid));
    }
}