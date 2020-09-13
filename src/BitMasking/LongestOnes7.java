//Longest Consecutive 1's
package BitMasking;

public class LongestOnes7 {
    public static void main(String[] args) {
    consecutive(15);
    }
    public static void consecutive(int n){
        int count = 0;
        while (n != 0){
            n = (n & (n << 1));
            count++;
        }
        System.out.println(count);
    }
}
