
import java.util.HashSet;
import java.util.Set;

////////// Longest SubString without repeating charecters ///////////

public class LongestSubString{
    public static int LongestSting(String str){

        Set<Character> longstring = new HashSet<>();
        int left = 0;
        int maxlen = 0;

        for(int i=0; i < str.length(); i++){

            while (longstring.contains(str.charAt(i))) { 
                longstring.remove(str.charAt(i));
                left++;
            }

            longstring.add(str.charAt(i));
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }
    public static void main(String[] args){

        String str = "abcabcbb";
        System.out.println(LongestSting(str));
    }
}

