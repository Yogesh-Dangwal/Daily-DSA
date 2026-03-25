package MergeSortArray;
import java.util.*;

public class MergeSortArray {

    public static void mergeSort(int[] a,int l,int r){

        if(l>=r)
            return;

        int m=(l+r)/2;

        mergeSort(a,l,m);
        mergeSort(a,m+1,r);

        merge(a,l,m,r);
    }

    public static void merge(int[] a,int l,int m,int r){

        int n1=m-l+1;
        int n2=r-m;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++)
            L[i]=a[l+i];

        for(int j=0;j<n2;j++)
            R[j]=a[m+1+j];

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){

            if(L[i]<=R[j])
                a[k++]=L[i++];
            else
                a[k++]=R[j++];
        }

        while(i<n1)
            a[k++]=L[i++];

        while(j<n2)
            a[k++]=R[j++];
    }

    public static void main(String[] args){

        int[] nums={5,2,3,1};

        mergeSort(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }
}