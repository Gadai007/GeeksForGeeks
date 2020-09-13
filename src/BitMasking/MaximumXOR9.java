package BitMasking;

import java.util.Scanner;

public class MaximumXOR9 {
    public static void main(String[] args) {
        int[] ar ={1,1,2,2,3,3,4};
        //maximumxor(ar);
    }
    public static void maximumxor(int[] ar){
        int ans1 =0;
        for (int i = 0; i <ar.length ; i++) {
            int ans2 =0;
            for (int j = i; j <ar.length ; j++) {
                ans2 = ans2 ^ ar[j];
                ans1 = Math.max(ans1, ans2);
            }
        }
        System.out.println(ans1);
    }
}
