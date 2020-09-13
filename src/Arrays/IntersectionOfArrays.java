package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,1,2,4,1};
        int[] ar2 = {2,1,3,1,5,2,2};
        intersection(ar1, ar2);
    }
    public static void intersection(int[] ar1, int[] ar2){
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        ArrayList list = new ArrayList();
        int i= 0;
        int j =0;
        while (i < ar1.length && j < ar2.length){
            if( ar1[i] == ar2[j]){
                list.add(ar1[i]);
                i++;
                j++;
            }
            else if(ar1[i] < ar2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        System.out.println(list);
    }
}
