//Set kth bit
package BitMasking;

public class Setkthbit3 {
    public static void main(String[] args) {

        setkthbit(8, 2);
    }

    public static void setkthbit(int n, int k){
        System.out.println(( 1 << k) | n);
        return;
    }
}
