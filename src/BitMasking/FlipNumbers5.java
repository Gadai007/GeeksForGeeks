//Bit Difference
package BitMasking;

public class FlipNumbers5 {
    public static void main(String[] args) {
        System.out.println(flippedcount(10, 20));
        //flippedcount(10,20);
    }
    public static int flippedcount(int a, int b){
        return countsetbit(a ^ b);
    }

    public static int countsetbit(int n){
        int count = 0;
        while (n != 0){
            count++;
            n =n & (n-1);
        }
        return count;
    }
}
