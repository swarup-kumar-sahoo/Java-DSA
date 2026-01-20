/////////////////// My Approach //////////////////////////////

// import java.util.Arrays;

// public class ReverseArray{
//     public static void main(String[] args) {

//         int[] arr = {1,2,3,4,5};

//         int[] temp = new int[arr.length];
//         int index = 0;
//         for(int i= (arr.length - 1); i  >= 0; i--){
//             temp[index] = arr[i];
//             index++;
//         }

//         System.out.println("Reversed array: " + Arrays.toString(temp));
//     }
// }

/////////////////////// Best Approach /////////////////////////////

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray{
    public static void main(String[] args) {
        
         List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

         int start = 0;
         int end = list.size() - 1;
         while(start < end){
            Collections.swap(list, start, end);
            start++;
            end--;
         }

         System.out.println(list);
    }
}