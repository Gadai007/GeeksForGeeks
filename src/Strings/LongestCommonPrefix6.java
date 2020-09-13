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
            for (int j = 0; j <n ; j++) {
                ar[j] = s.next();
            }
            String ans = commonPrefix(ar, 0, ar.length-1);
            if(ans.length() != 0){
                System.out.println(ans);
            }
            else{
                System.out.println(-1);
            }
        }
    }
    public static String commonPrefixUtil(String s1, String s2){
        String result ="";
        int i =0;
        int j =0;
        while (i < s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                break;
            }
            result += s1.charAt(i);
            i++;
            j++;
        }
        return result;
    }

    public static String commonPrefix(String[] ar, int start, int end){
        if( start == end){
            return ar[start];
        }

        if(start < end){
            int mid = start + (end - start)/2;
            String s1 = commonPrefix(ar,start,mid);
            String s2 = commonPrefix(ar,mid+1,end);

            return commonPrefixUtil(s1, s2);
        }
        return null;
    }
}
