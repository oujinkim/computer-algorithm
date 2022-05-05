package sort;

import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SortTestDrive {

    private static final int N = 20; // 데이터 지수값

    public static void main(String[] args) {


        Instant start = Instant.now();
        Random random = new Random();
        int[] arr = new int[(int) Math.pow(2, N)]; //2^N 값의 데이터
//        int j = arr.length;

//        for(int i=0;i< arr.length;i++) //정렬된 데이터일때
//        {
//            arr[i] = i;
//        }
//
//        for(int i=0;i<arr.length;i++)  //역정렬된 데이터일때
//        {
//            arr[i] = j;
//            j--;
//        }

        for (int i = 0; i < arr.length; i++) { // 랜덤 데이터일때
            arr[i] = random.nextInt(arr.length);
        }
//        System.out.println(Arrays.toString(arr));
        Sort[] sarr = new Sort[5];
        sarr[0] = new BubbleSort(); // 버블정렬
        sarr[1] = new InsertionSort(); // 선택정렬
        sarr[2] = new SelectionSort(); // 삽입정렬
        sarr[3] = new ShellSort(); //쉘정렬
        sarr[4] = new HeapSort(); //힙정렬

//        int[] x = sarr[4].sort(arr);
//        System.out.println(Arrays.toString(x));

        int[] y = new QuickSort().sort(arr, 0, arr.length - 1); // 퀵정렬
        System.out.println("QuickSort");
        System.out.println(Arrays.toString(y));

        Instant finish = Instant.now();
        long elapsedTime = Duration.between(start, finish).toMillis();
        System.out.println("elapsedTime(ms) : " + elapsedTime);


    }
}
