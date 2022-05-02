package sort;
import java.util.Comparator;

public class SelectionSort<T> extends Sort<T>{
    @Override
    public T[] sort(T[] src,Comparator<T> comp) {
        T [] dst = src.clone();
        for(int i =0; i<dst.length;i++){
            T min = dst[i];
            int idx = i;

            for(int j = i; j< dst.length;j++){
                if (comp.compare(min, dst[j]) > 0){
                    min = dst[j];
                    idx = j;
                }
            }
            T tmp = dst[i];
            dst[i] = dst[idx];
            dst[idx] = tmp;
        }
        return dst;
    }
}
