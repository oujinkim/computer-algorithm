package sort;
import java.util.Comparator;
public class InsertionSort<T> extends Sort<T>{

    @Override
    public T[] sort(T[] src, Comparator<T> comp) {
        System.out.println(this.getClass().getSimpleName());
        T[] dst = src.clone();

        for(int i=0;i< dst.length-1;i++){
            T tmp = null;
            if(comp.compare(dst[i], dst[i+1]) > 0)
            {
                tmp = dst[i];
            }
            int j = i - 1;
            while( (j>=0) && (comp.compare(dst[i], tmp) > 0)){
                dst[i+1] = dst[j];
                j--;
            }
            dst[j+1] = tmp;
        }

        return (T[])dst;

    }
}
