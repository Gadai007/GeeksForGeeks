//Power of 2

package BitMasking;

public class PowerOfTwo4 {
    public static void main(String[] args) {
        System.out.println(poweroftwo(98) ? "Yes" : "No");
    }
    public static boolean poweroftwo(int n){  //the & operation of n and (n-1) is zero if it is power of two

        return n != 0 && ((n & (n-1)) == 0);
    }
}
