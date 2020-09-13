package BitMasking;

public class PowerOfTwo {
    public static void main(String[] args) {
       powerOfTwo(98);
    }
    public static void powerOfTwo(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        if(count != 1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
