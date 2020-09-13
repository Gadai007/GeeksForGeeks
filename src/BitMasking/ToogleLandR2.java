package BitMasking;

public class ToogleLandR2 {
    public static void main(String[] args) {
    togglelandr(17,2,3);
    }
    public static void togglelandr(int n, int l, int r){
        int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);
        System.out.println(n ^ num);
    }
}
