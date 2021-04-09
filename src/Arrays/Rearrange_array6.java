/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively
i.e first element should be max value,
second should be min value, third should be second max,
fourth should be second min and so on..*/
package Arrays;

import java.util.ArrayList;

public class Rearrange_array6 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        rearrangeArray(ar);
        System.out.println();
        rearrange(ar);
    }
    public static void rearrangeArray(int[] ar){
        ArrayList list = new ArrayList();
        int start =0;
        int end = ar.length-1;
        boolean flag = true;
        for (int i = 0; i < ar.length; i++) {
           if(flag){
               list.add(ar[end--]);
           }
           else{
               list.add(ar[start++]);
           }
           flag = !flag;
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
    }

    public static void rearrange(int[] ar){
        ArrayList list = new ArrayList();
        int start =0;
        int end = ar.length-1;
        boolean flag = true;
        while (start <= end){
            if(flag){
                list.add(ar[end--]);
            }
            else{
                list.add(ar[start++]);
            }
            flag = !flag;
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
