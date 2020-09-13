//K-th element of two sorted Arrays

package DivideAndConquer;

public class Kthelement6 {
    public static void main(String[] args) {
        int[] ar1 = {2,3,6,7,9};
        int[] ar2 = {1,4,8,10};
        System.out.println(merge(ar1, ar2, 5));
    }
    public static int merge(int[] first, int[] second, int element){
        int[] ar = new int[first.length + second.length];
        int i =0;
        int j =0;
        int k =0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                ar[k] = first[i];
                i++;
                k++;
            }
            else {
                ar[k] = second[j];
                j++;
                k++;
            }
        }
        while(i < first.length ){
            ar[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length ){
            ar[k] = second[j];
            j++;
            k++;
        }
         return ar[element-1];
    }
}
