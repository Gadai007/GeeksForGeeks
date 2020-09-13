package DivideAndConquer;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8};
        System.out.println(binarysearch(ar,6));

    }
    public static int binarysearch(int[] ar, int target){
        int start = 0;
        int end = ar.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(ar[mid] == target){
                return mid;
            }
            else if(ar[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
