/*Pythagorus Triplet*/
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pythagorus_Triplet13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            int[] ar = new int[n];
            for (int j = 0; j <n ; j++) {
                ar[j] = s.nextInt();
            }
            pythagorean(ar);
        }
    }
    public static void pythagorean(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i]*ar[i];
        }

        Arrays.sort(ar);

        for (int i = ar.length-1; i >=2 ; i--) {
            int start = 0;
            int end = i-1;
            while (start < end){
                if (ar[start] + ar[end] == ar[i]){
                    System.out.println("Yes");
                    return;
                }
                if(ar[start] + ar[end] < ar[i]){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        System.out.println("No");
        return;
    }
}
