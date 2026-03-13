package Heap.FindKPairsWithSmallestSums;
import java.util.*;

public class FindKPairsWithSmallestSums {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );

        for(int i = 0; i < nums1.length && i < k; i++){
            pq.add(new int[]{i,0});
        }

        while(k > 0 && !pq.isEmpty()){
            int[] cur = pq.poll();
            int i = cur[0];
            int j = cur[1];

            res.add(Arrays.asList(nums1[i], nums2[j]));

            if(j + 1 < nums2.length){
                pq.add(new int[]{i, j+1});
            }

            k--;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        int k = 3;

        List<List<Integer>> result = kSmallestPairs(nums1, nums2, k);

        for(List<Integer> pair : result){
            System.out.println(pair);
        }
    }
}