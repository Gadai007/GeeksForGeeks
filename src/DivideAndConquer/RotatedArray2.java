package DivideAndConquer;

import java.util.Scanner;

public class RotatedArray2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        for (int i = 0; i <t ; i++) {
//            int n = s.nextInt();
//            int[] ar = new int[n];
//            for (int j = 0; j <n ; j++) {
//                ar[j] = s.nextInt();
//            }
//            int target = s.nextInt();
//            System.out.println(rotatedarray(ar,target));
//        }
        int[] ar = {4,5,6,7,0,1,2};
        System.out.println(rotatedarray(ar, 7));
        //rotatedarray(ar,0);
        rotated(ar,7);
    }
    public static int rotatedarray(int[] ar, int target){
        int left= 0;
        int right = ar.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(ar[mid] > ar[right]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        int start = left;
        left =0;
        right = ar.length-1;

        if(target >= ar[start] && target <= ar[right]){
            left = start;
        }
        else {
            right = start;
        }

        while (left <= right){
            int mid = left + (right-left)/2;
            if(ar[mid] == target){
                return mid;
            }
            else if(ar[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static void rotated(int[] ar, int target){
        if(ar.length == 0){
            return;
        }

        int start = 0;
        int end = ar.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if(ar[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(ar[start] <= ar[mid]){
                if(target >= ar[start] && target <= ar[mid]){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target >= ar[mid] && target <= ar[end]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
    }
}
