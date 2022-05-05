package sort;

import java.util.PriorityQueue;

public class HeapSort extends Sort{
    @Override
    public int[] sort(int[] src) {
        System.out.println(this.getClass().getSimpleName());
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i =0;i< src.length;i++){
            pq.add(src[i]);
        }
        int [] dst = new int[src.length];
        for(int i=0;i< src.length;i++){
            dst[i] = pq.remove();
        }

        return dst;
    }
}
