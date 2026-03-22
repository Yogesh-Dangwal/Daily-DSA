package MatrixRotationCheck;

public class MatrixRotationCheck {

    public static boolean findRotation(int[][] mat,int[][] target){

        int n=mat.length;

        for(int r=0;r<4;r++){

            if(check(mat,target))
                return true;

            mat=rotate(mat);
        }

        return false;
    }

    static boolean check(int[][] a,int[][] b){

        int n=a.length;

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(a[i][j]!=b[i][j])
                    return false;

        return true;
    }

    static int[][] rotate(int[][] m){

        int n=m.length;

        int[][] r=new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                r[j][n-1-i]=m[i][j];

        return r;
    }

    public static void main(String[] args){

        int[][] mat={{0,1},{1,0}};
        int[][] target={{1,0},{0,1}};

        System.out.println(findRotation(mat,target));
    }
}