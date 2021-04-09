/*Leaders in an array*/
package Arrays;

public class Leaders_of_array10 {
    public static void main(String[] args) {
        int[] ar = {16, 17, 4, 3, 5, 2};
        leader(ar);

    }
    public static void leader(int[] ar){
        int maxright = ar[ar.length-1];
        System.out.print(maxright + " ");
        for (int i = ar.length-2; i >=0 ; i--) {
            if(maxright <= ar[i]){
                maxright = ar[i];
                System.out.print(maxright + " ");
            }
        }
    }


}
