package DivideAndConquer;

import java.util.Arrays;

public class Quicksort4 {
    public static void main(String[] args) {
    int[] ar = {0,10,2,4};
    quicksort(ar, 0, ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    public static void quicksort(int[] ar, int start, int end){
        if(start >= end){
            return;
        }
        int p = pivot(ar, start, end);
        quicksort(ar, start, p-1);
        quicksort(ar,p+1, end);
    }

    private static int pivot(int[] ar, int start, int end) {
        int j = start;
        for (int i = start; i <end ; i++) {
            if(ar[i] < ar[end]){
                swap(ar, i, j);
                j++;
            }
        }
        swap(ar, j, end);
        return j;
    }

    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
