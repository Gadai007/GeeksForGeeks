/*Reverse an array in groups*/
package Arrays;

import java.util.Arrays;

public class Reverse_groups11 {
    public static void main(String[] args) {
      int[] ar = {10, 20, 30, 40, 50, 60};
      reverse(ar,2);
      System.out.println(Arrays.toString(ar));
    }
    public static void reverse(int[] ar, int k){
        for (int i = 0; i <ar.length ; i+=k) {

            int start = i;
            int end = Math.min(i+k-1, ar.length-1);
            while (start < end){
                int temp = ar[start];
                ar[start] = ar[end];
                ar[end] = temp;
                start++;
                end--;
            }
        }
    }
}
