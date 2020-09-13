//Evaluate strstr

package Strings;

public class StrStr5 {
    public static void main(String[] args) {
       String s1 = "Coding blocks";
       String s2 = "blocks";
       //System.out.println(strstr(s1, s2));
       strstr(s1, s2);
    }
    public static int strstr(String s1, String s2){
        if(s1 == null || s2.length() > s1.length()){
            return -1;
        }

        if(s2 == null || s2.length() == 0){
            return 0;
        }

        for (int i = 0; i <= s1.length() - s2.length() ; i++) {
            int j;
            for ( j = 0; j <s2.length() ; j++) {
                if(s2.charAt(j) != s1.charAt(i+j)){
                    break;
                }
            }
            if( j == s2.length()){
                return i;
            }
        }
        return -1;
    }
}
