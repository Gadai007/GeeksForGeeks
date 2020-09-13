package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
//       int[] x = {1,4,7,8,10};
//       int[] y = {2,3,9};
//       merge(x,y);
//       System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] x = new int[n];
            int[] y = new int[m];
            for (int j = 0; j <x.length ; j++) {
                x[j] = s.nextInt();
            }
            for (int k = 0; k <y.length ; k++) {
                y[k] = s.nextInt();
            }
            merge(x,y);
            for (int j = 0; j <x.length ; j++) {
                System.out.print(x[j] + " ");
            }
            System.out.println();
            for (int j = 0; j <y.length ; j++) {
                System.out.print(y[j] + " ");
            }
        }
    }
    public static void merge(int[] x, int[] y){
        for (int i = 0; i <x.length ; i++) {
            if(x[i] > y[0]){
                int temp = x[i];
                x[i] = y[0];
                y[0] = temp;
            }
            Arrays.sort(y);
        }
    }
}
