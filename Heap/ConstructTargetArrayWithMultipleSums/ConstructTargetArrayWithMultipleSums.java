package Heap.ConstructTargetArrayWithMultipleSums;
import java.util.*;

public class ConstructTargetArrayWithMultipleSums {

    public static boolean isPossible(int[] target) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : target){
            sum += x;
            pq.add(x);
        }

        while(true){
            int max = pq.poll();
            long rest = sum - max;

            if(max == 1 || rest == 1) return true;
            if(rest == 0 || max <= rest) return false;

            int prev = (int)(max % rest);
            if(prev == 0) return false;

            pq.add(prev);
            sum = rest + prev;
        }
    }

    public static void main(String[] args) {
        int[] target = {9,3,5};
        System.out.println(isPossible(target));
    }
}