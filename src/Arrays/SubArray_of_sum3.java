/*Given an unsorted array A of size N of non-negative integers,
find a continuous sub-array which adds to a given number S*/

package Arrays;

import java.util.Scanner;

public class SubArray_of_sum3 {
    public static void main(String[] args) {
      int[] ar = {1, 2, 3, 7, 5};
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        for (int i = 0; i <t ; i++) {
//            int n = s.nextInt();
//            int sum = s.nextInt();
//            int[] ar = new int[n];
//            for (int j = 0; j <n ; j++) {
//                ar[j] = s.nextInt();
//            }
//            subarray(ar, sum);
//        }
        subarray(ar, 12);
    }
    public static void subarray(int[] ar, int sum){

        int currentsum =ar[0];
        int start =0;
        for (int i = 1; i <= ar.length ; i++) {
            while (currentsum > sum && start < i -1){
                currentsum -= ar[start];
                start++;
            }
            if(currentsum == sum){
                int p = i -1;
                System.out.println("Subarray found at "+ start + " and "+ p);
                return;
            }
            if(i < ar.length){
                currentsum += ar[i];
            }
        }
        System.out.println("No subarray found");
        return;
    }
}
