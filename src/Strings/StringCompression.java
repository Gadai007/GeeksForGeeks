package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "DebayanDebnath";
//        duplicate(s,"",0);
        //compression(s);
        //maxFrequency(s);
        //difference(s);
        //System.out.println(isPallindrome(s));
        //isPallindrome(s);
        camelCase(s);
    }
    public static void compression(String s){
        int count = 1;
        StringBuilder b = new StringBuilder();
        char ch = s.charAt(0);
        b.append(ch);
        for (int i = 1; i <s.length() ; i++) {
            if(ch == s.charAt(i)){
                count++;
            }
            else {
                ch = s.charAt(i);
                b.append(("" + count) + ch);
                count = 1;
            }
        }
        b.append(count);
        System.out.println(b.toString());
    }

    public static void maxFrequency(String s){
        int count1 =1;
        char ch1 = s.charAt(0);
        for (int i = 1; i <s.length() ; i++) {
            int count2 =1;
            char ch2 = s.charAt(i);
            for (int j = 1; j <s.length() ; j++) {
                if(ch2 == s.charAt(j)){
                    count2++;
                }
            }
            if(count2 > count1){
                count1 = count2;
                ch1 = ch2;
            }
        }
        System.out.println(ch1);
    }

    public static void difference(String s){
        StringBuilder b = new StringBuilder();
        char ch = s.charAt(0);
        b.append(ch);
        for (int i = 1; i <s.length() ; i++) {
            int diff =s.charAt(i) - ch;
            b.append(diff);
            ch = s.charAt(i);
            b.append(ch);
        }
        System.out.println(b.toString());
    }

    public static boolean isPallindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void camelCase(String s){
        int i=0;
        while(i < s.length()){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                System.out.print(s.charAt(i));
                i++;
            }
            while ( i < s.length() && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                System.out.print(s.charAt(i));
                i++;
            }
            System.out.println();
        }
    }

    public static void duplicate(String  s1, String s2, int index){
        if(index == s1.length()){
            System.out.println(s2);
            return;
        }
        if(index == s1.length()-1){
            s2 = s2 + s1.charAt(index);
        }
        else if(s1.charAt(index) != s1.charAt(index + 1)){
            s2 = s2 + s1.charAt(index);
        }
        else {
            s2 = s2;
            duplicate(s1, s2, index+2);
        }
        duplicate(s1, s2, index+1);
    }
}
