/*Check if a string can be obtained by rotating another string 2 places*/
package Strings;

public class StringRotate2 {
    public static void main(String[] args) {
      String s1 = "geeks";
      String s2 = "eksge";
        System.out.println(rotate(s1, s2) ? "Yes": "No");
        rotate(s1, s2);
    }
    public static boolean rotate(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String anticlockrot = "";
        String clockrot = "";
        int len = s2.length();

        anticlockrot = anticlockrot + s2.substring(len-2, len) + s2.substring(0, len-2);

        clockrot = clockrot + s2.substring(2) + s2.substring(0,2);

        return (s1.equals(anticlockrot) || s2.equals(clockrot));
    }
}
