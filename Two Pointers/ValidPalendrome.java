////////////////////// Check Palindrome Using Two Pointer /////////////////////////////////
public class ValidPalendrome {

    public static boolean checkPalindrome(String str){

        int l = 0;
        int r = str.length()-1;

        while(l < r){

            while(l<r && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }

            while(l<r && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))){
                return false;
            }

            l++;
            r--;
        }

        return true;

    }

    public static void main(String[] args){

        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }
    
}
