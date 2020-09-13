/*Given an array of distinct integers. The task is to count all the triplets such that sum of two
elements equals the third element.*/
package Arrays;

import java.util.Arrays;

public class Count_triplets4 {
    public static void main(String[] args) {
        int[] ar = {1, 5, 3, 2};
        tripletcount(ar);
    }
    public static void tripletcount(int[] ar){
        Arrays.sort(ar);
        int count = 0;
        for (int i = ar.length-1; i >= 0 ; i--) {
            int j =0;
            int k = i-1;
            while(j < k){
                if(ar[i] == ar[j] + ar[k]){
                    count++;
                    j++;
                    k--;
                }
                else if(ar[i] > ar[j] + ar[k]){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        System.out.println(count);
    }
}
