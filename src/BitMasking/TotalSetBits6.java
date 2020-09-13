//Count total set bits
package BitMasking;

import java.util.Scanner;

public class TotalSetBits6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            int sum =0;
            for (int j = 0; j <=n ; j++) {
                sum += set(j);
            }
            System.out.println(sum);
        }
    }
    public static int set(int n){
        int count = 0;
        while(n !=0){
            count = count + (n&1);
            n = n >> 1;
        }
        return count;
    }
}
