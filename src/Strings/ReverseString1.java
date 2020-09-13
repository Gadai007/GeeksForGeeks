//Reverse words in a given string
package Strings;

public class ReverseString1 {
    public static void main(String[] args) {
        String s = "Debayan.Debnath";
        reverse(s);
    }
    public static void reverse(String s){
        String[] str = s.split("\\.");
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
