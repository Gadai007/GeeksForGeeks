//Number is sparse or not
package BitMasking;

import java.util.Scanner;

public class SparseNumber8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n = s.nextInt();
            System.out.println(sparse(n));
        }
    }
    public static int sparse(int n){
        if((n & (n >> 1)) >= 1){
            return 0;
        }
        return 1;
    }
}
