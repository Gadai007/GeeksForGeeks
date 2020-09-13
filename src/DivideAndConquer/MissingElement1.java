//Find the element that appears once in sorted array
package DivideAndConquer;

public class MissingElement1 {
    public static void main(String[] args) {
        int[] ar = {1,1,2,2,3,3,4};
        //System.out.println(missing(ar));
        miss(ar);
        System.out.println(binarymissing(ar));
        //binarymissing(ar);
    }
    public static int missing(int[] ar){
        if(ar.length == 0){
            return -1;
        }
        if(ar.length == 1){
            return ar[0];
        }

        int i =0;
        while(i < ar.length-1){
            if(ar[i] != ar[i+1]){
                return ar[i];
            }
            i = i+2;
        }
        return ar[i];
    }
    public static int binarymissing(int[] ar){
        int start = 0;
        int end = ar.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(start == end){
                return ar[start];
            }
            else if(mid%2 != 0){
                if(ar[mid-1] == ar[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else{
                if(ar[mid] == ar[mid+1]){
                    start = mid + 2;
                }
                else {
                    end = mid;
                }
            }
        }
        return -1;
    }

    public static void miss(int[] ar){
        int sum =0;
        for (int i = 0; i <ar.length ; i++) {
            sum = sum ^ ar[i];
        }
        System.out.println(sum);
    }
}
