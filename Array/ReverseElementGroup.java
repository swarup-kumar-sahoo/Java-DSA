package Array;

//////////////////////// Best Approach ///////////////////////////////////////

import java.util.Arrays;

public class ReverseElementGroup {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int length = arr.length;

        for(int i=0; i<length ; i+=k){
            int start = i;
            int end = Math.min(i+k-1, length-1);

            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
    
}
