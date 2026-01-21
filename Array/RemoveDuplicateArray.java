package Array;



/////////////////////////// My approach ////////////////////////////////

import java.util.Arrays;

// public class RemoveDuplicateArray {
//     public static void main(String[] args) {
       
//         int[] arr = {1,2,2,3,4,4};

//         int[] result = new int[arr.length];
//         int index = 1;
//         result[0] = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i-1] != arr[i]){
//                 result[index] = arr[i];
//                 index++;
//             }
//         }

//         System.out.println("Sorted array: " + Arrays.toString(result));

//     }
// }

//////////////////////////// Best Approach ////////////////////////////////////////

public class RemoveDuplicateArray {
    public static void main(String[] args) {
       
        int[] arr = {1,2,2,2,3,4,4};

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Removed deulicate sorted array: ");
        System.out.println(Arrays.toString(Arrays.copyOf(arr, index)));

    }
}

