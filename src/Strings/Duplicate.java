package Strings;

public class Duplicate {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        duplicate(s);
    }
    public static void duplicate(String s){
        StringBuilder b = new StringBuilder();
        int[] fre = new int[256];
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            if(fre[index] == 0){
                b.append(ch);
                fre[ch - 'a']++;
            }
        }
        System.out.println(b.toString());
    }
}
