/*Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted.
 If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j*/
package Arrays;

public class Inversion_array7 {
    public static void main(String[] args) {
        int[] ar = {2, 4, 1, 3, 5};
        inversion(ar);
    }
    public static void inversion(int[] ar){
        int count =0;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = i+1; j <ar.length ; j++) {
                if( ar[i] > ar[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
