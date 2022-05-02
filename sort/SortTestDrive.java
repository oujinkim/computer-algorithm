package sort;
import java.util.Comparator;
public class SortTestDrive{
    public static void main(String[] args) {
        Float[] arr = {7.3f, 8.2f, 6.4f, 5.1f, 4.4f, 3.3f, 2.2f, 1.1f};
        Integer[] arr2 = {7, 8, 6, 5, 4, 3, 2, 1};

        BubbleSort bubbleSort = new BubbleSort();
        Sort [] sarr = new Sort[3];
        sarr[0] = bubbleSort;
        sarr[1] = new InsertionSort();
        sarr[2] = new SelectionSort();

        for(int i =0;sarr.length;i++)
        {
            float x[] = sarr[i].sort(arr);
        }
    }
}
