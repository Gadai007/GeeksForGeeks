package Arrays;

public class SlidingWindow1 {
    public static void main(String[] args) {
        int[]  ar = {100, 200, 300, 400};
        //bruteForce(ar,2);
        slidingWindow(ar,2);
    }
    public static void bruteForce(int[] ar , int k){
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i <ar.length -k + 1 ; i++) {
            int currentvalue = 0;
            for (int j = 0; j <k ; j++) {
                currentvalue = currentvalue + ar[i+j];
                maxvalue = Math.max(maxvalue,currentvalue);
            }
        }
        System.out.println(maxvalue);
    }

    public static void slidingWindow(int[] ar, int k){
        if(ar.length < k){
            System.out.println("Invalid");
            return;
        }

        int maxsum = 0;
        for (int i = 0; i <k ; i++) {
            maxsum = maxsum + ar[i];
        }

        int windowsum = maxsum;
        for (int i = k; i <ar.length ; i++) {
            windowsum = windowsum + ar[i] - ar[i-k];
            maxsum = Math.max(maxsum, windowsum);
        }
        System.out.println(maxsum);
    }
}
