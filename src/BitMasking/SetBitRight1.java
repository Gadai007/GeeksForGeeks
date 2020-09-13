//Find first set bit

package BitMasking;

public class SetBitRight1 {
    public static void main(String[] args) {
        positionRightSetBit(16);
    }
    public static void positionRightSetBit(int n){
        int position = 1;
        int m = 1;
        while ((n & m) == 0){
            m = m << 1;
            position++;
        }
        System.out.println(position);
    }
}
