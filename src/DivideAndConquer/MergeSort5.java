package DivideAndConquer;

import java.util.Arrays;

public class MergeSort5 {
    public static void main(String[] args) {
        int[] ar = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(ar)));
    }
    public static int[] merge(int[] first, int[] second){
        int[] ar = new int[first.length + second.length];
        int i =0;
        int j =0;
        int k =0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                ar[k] = first[i];
                i++;
                k++;
            }
            else {
                ar[k] = second[j];
                j++;
                k++;
            }
        }
        while(i < first.length ){
            ar[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length ){
            ar[k] = second[j];
            j++;
            k++;
        }
        return ar;
    }

    public static int[] mergesort(int[] nums){
        if(nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);

        first = mergesort(first);
        second = mergesort(second);
        return merge(first,second);
    }
}
