/*Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing,
 the missing number is to be found*/
package Arrays;

public class Missing_element5 {
    public static void main(String[] args) {
//    int[] ar ={1, 2, 3, 5};
//    missingelement(ar);
        converFive(1004);
    }
    public static void missingelement(int[] ar){
        int total= (ar.length+1)*(ar.length+2)/2;
        for (int i = 0; i <ar.length ; i++) {
            total = total - ar[i];
        }
        System.out.println(total);
    }

    public static void converFive(int n){
        int result = 0;
        while(n > 0){
            int r = n%10;
            if(r == 0){
                result = result*10 + 5;
            }else{
                result = result*10 + r;
            }
            n = n/10;
        }
        System.out.println(result);
    }
}
