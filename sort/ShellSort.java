package sort;

public class ShellSort extends Sort{

    private final static int[] gap =
            { 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
                    8858, 19930, 44842, 100894, 227011, 510774,
                    1149241, 2585792, 5818032, 13090572, 29453787,
                    66271020, 149109795, 335497038, 754868335, 1698453753};

    private static int getGap(int[] src,int length) {
        int index = 0;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len = (int)(length / 2.25);
        while (gap[index] < len) {
            index++;
        }
        return index;
    }


    @Override
    public int[] sort(int[] src) {
        System.out.println(this.getClass().getSimpleName());
        int dst[] = src.clone();

        for (int h = getGap(dst,dst.length); h>=1; h--)
        {
            for(int i =h;i <= dst.length-1;i++)
            {
                int tmp = dst[i];
                int j =i;
                while( (j>=h) && (dst[j-h] > tmp)){
                    dst[j]=dst[j-h];
                    j=j-h;
                }
                dst[j]=tmp;
            }

        }
        return dst;
    }
}
