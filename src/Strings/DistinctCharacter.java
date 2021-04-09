package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctCharacter {
    public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);
//       int t = s.nextInt();
//        for (int i = 0; i <t ; i++) {
//            String str = s.next();
//            distinctCharacter(str);
//        }
//        distinctCharacter("geeksforgeeks");
        distinct("geeksforgeeks");
//        System.out.println(Integer.parseInt("1234"));
    }
    public static void distinctCharacter(String s){
        if(s == null || s.length() == 0){
            return ;
        }
        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i =0;
        for (int j = 0; j <s.length() ; j++) {
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                result = Math.max(result, set.size());
            }
            else {
                while ( i < j){
                    if(s.charAt(i) == ch){
                        i++;
                        break;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        System.out.println(result);
    }

                                //    It is the easy one

    public static void distinct(String s){
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while( j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(set.size(), max);
                j++;
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(max);
    }
}
