/*Equilibrium index of an array*/

package Arrays;

public class Equilibrium_point9 {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 2, 2};
        equilibriumPoint(ar);
    }
    public static void equilibriumPoint(int[] ar){
        int sum =0 ;
        int leftsum =0;
        for (int i = 0; i <ar.length ; i++) {
            sum = sum + ar[i];
        }

        for (int i = 0; i <ar.length ; i++) {
            sum = sum - ar[i];

            if(leftsum == sum){
                System.out.println(i+1);
                return;
            }
            leftsum = leftsum+ ar[i];
        }
        System.out.println(-1);
        return;
    }
}
