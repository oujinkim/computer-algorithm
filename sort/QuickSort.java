package sort;

public class QuickSort{

    static int partition(int[] array, int start, int end) {
        int pivot = array[(start+end)/2];
        while(start<=end) {
            while(array[start]<pivot) start++;
            while(array[end]>pivot) end--;
            if(start<=end) {
                int tmp = array[start];
                array[start]=array[end];
                array[end]=tmp;
                start++;
                end--;
            }
        }
        return start;
    }

    public int[] sort(int[] src,int start, int end) {
        int p = partition(src, start, end);
        if(start<p-1)
            sort(src,start,p-1);
        if(p<end)
            sort(src,p,end);
        return src;
    }
}
