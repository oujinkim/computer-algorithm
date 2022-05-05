package sort;


public class SelectionSort extends Sort{
    @Override
    public int[] sort(int[] src) {
        System.out.println(this.getClass().getSimpleName());
        int [] dst = src.clone();
        for(int i =0; i<dst.length;i++){
            int min = dst[i];
            int idx = i;

            for(int j = i; j< dst.length;j++){
                if (min > dst[j]){
                    min = dst[j];
                    idx = j;
                }
            }
            int tmp = dst[i];
            dst[i] = dst[idx];
            dst[idx] = tmp;
        }
        return dst;
    }
}
