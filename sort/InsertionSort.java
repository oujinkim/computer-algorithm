package sort;

public class InsertionSort extends Sort{


    @Override
    public int[] sort(int[] src) {
        System.out.println(this.getClass().getSimpleName());
        int[] dst = src.clone();
        //int[] arr = {7, 8, 6, 5, 4, 3, 2, 1};
        for (int i = 1; i < dst.length; i++) {
            int tmp = dst[i];
            int j = i - 1;
            while ((j >= 0) && (dst[j] > tmp)) {
                dst[j + 1] = dst[j];
                j--;
            }
            dst[j + 1] = tmp;
        }
        return dst;
    }
}
