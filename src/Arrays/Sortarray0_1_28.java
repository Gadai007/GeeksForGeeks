/*Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.*/

package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Sortarray0_1_28 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n =s.nextInt();
//            int[] ar = new int[n];
//            for (int j = 0; j <n ; j++) {
//                ar[j] = s.nextInt();
//            }
//            sort(ar);
//            for (int j = 0; j <ar.length ; j++) {
//                System.out.print(ar[j] + " ");
//            }
//        }
        int[] ar = {0,1,2,1,2};
        sorty(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void sort(int[] ar){
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-i-1 ; j++) {
                if(ar[j] > ar[j+1]){
                    swap(ar, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] ar, int j, int i) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void sorty(int[] ar){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 0){
                count0++;
            }
            else if(ar[i] == 1){
                count1++;
            }
            else {
                count2++;
            }
        }
        int i =0;
        while (count0 > 0){
            ar[i] = 0;
            count0--;
            i++;
        }
        while (count1 > 0){
            ar[i] = 1;
            count1--;
            i++;
        }
        while (count2 > 0){
            ar[i] = 2;
            count2--;
            i++;
        }
    }
}
