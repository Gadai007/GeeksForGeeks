/*Kth smallest element*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kthsmallest_element12 {
    public static void main(String[] args) {
//      int[] ar = {7, 10, 4, 20, 15};
//      kthelement(ar,4 );
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j <n ; j++) {
                ar[j] = s.nextInt();
            }
            int k = s.nextInt();
            kthelement(ar,k);
        }
    }
    public static void kthelement(int[] ar, int k){
        Arrays.sort(ar);
        System.out.println(ar[k-1]);
    }
}
