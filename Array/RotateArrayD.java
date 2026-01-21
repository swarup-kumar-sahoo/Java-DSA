package Array;

import java.util.Arrays;

public class RotateArrayD {
    
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        int d = 4; 

        int index = 0;
        int start = 0;
        int[] temp = new int[arr.length];

        for(int i=d; i < arr.length ; i++){
            temp[index] = arr[i]; 
            index++;
        }

        while(index < arr.length){
            temp[index] = arr[start];
            index++;
            start++;
        }

        System.out.println(Arrays.toString(temp));
    }

}

