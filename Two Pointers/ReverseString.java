
import java.util.Arrays;

public class ReverseString{

    public static void ReverseStringArray(String[] str){

        String temp;
        int start = 0;
        int end = str.length - 1;

        while(start < end){

            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;

        }

        System.out.println("Reversed String array: " + Arrays.toString(str));

    }
    public static void main(String[] args) {
        String[] str = {"h", "e", "l", "l", "o"};

        ReverseStringArray(str);

    }
}