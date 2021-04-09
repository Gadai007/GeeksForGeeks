//Longest Common Prefix using Divide and Conquer Algorithm
package Strings;

import java.awt.*;
import java.util.Scanner;

public class LongestCommonPrefix6 {
    public static void main(String[] args) {
//        String[] ar = {"geeksfor","geeks","geek"};
//        String ans = commonPrefix(ar, 0, ar.length-1);
//        System.out.println(ans);
          Scanner s = new Scanner(System.in);
          int t = s.nextInt();
          for (int i = 0; i < t ; i++) {
              int n = s.nextInt();
              String[] ar = new String[n];
              for (int j = 0; j < n; j++) {
                  ar[j] = s.next();
              }
              prefix(ar);
          }
    }

    public static void prefix(String[] strs){
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        System.out.println(prefix);
    }
}
