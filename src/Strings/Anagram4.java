//Anagram
package Strings;

public class Anagram4 {
    public static void main(String[] args) {
        String s1= "debayan";
        String s2 = "dabayab";
        anagram(s1, s2);
    }
    public static void anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        int[] fre = new int[26];
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            fre[ch - 'a']++;
        }

        for (int i = 0; i <s2.length() ; i++) {
            char ch = s2.charAt(i);
            fre[ch-'a']--;
        }

        for (int i = 0; i <fre.length ; i++) {
            if(fre[i] == 1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
