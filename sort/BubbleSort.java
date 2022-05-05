package sort;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort extends Sort{
    @Override
    public int[] sort(int[] src) {
        Instant start = Instant.now();
        System.out.println(this.getClass().getSimpleName());
        int[] dst = src.clone();
        int pass;
        for(pass = 0;pass< dst.length;pass++)
        {
            for(int i=0;i<dst.length - pass-1;i++)
            {
                if(dst[i]>dst[i+1])
                {
                    int temp = dst[i];
                    dst[i] = dst[i+1];
                    dst[i+1] = temp;
                }
            }
        }
        return dst;
    }
}
