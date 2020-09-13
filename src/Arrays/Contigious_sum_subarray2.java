/*Kadane's Algorithm*/
package Arrays;

import java.util.Scanner;

public class Contigious_sum_subarray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n =s.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j <n ; j++) {
                ar[j] = s.nextInt();
            }
            contigiousArray(ar);
            negativecontisum(ar);
        }
    }
    public static void contigiousArray(int[] ar){
        int sum1 =0;
        int sum2 =0;
        for (int i = 0; i <ar.length ; i++) {
            sum1 =sum1 + ar[i];
            if(sum1 < 0){
                sum1=0;
            }
            else if(sum2 < sum1){
                sum2 = sum1;
            }
        }
        System.out.println(sum2);
    }
    //handles all the elements in an array negative
    public static void negativecontisum(int[] ar){
        int sum1 = ar[0];
        int sum2 = ar[0];
        for (int i = 1; i <ar.length ; i++) {
            sum1 = sum1 + ar[i];
            if(sum1 < ar[i]){
                sum1 = ar[i];
            }
            if(sum2 < sum1){
                sum2 = sum1;
            }
        }
        System.out.println(sum2);
    }
}
