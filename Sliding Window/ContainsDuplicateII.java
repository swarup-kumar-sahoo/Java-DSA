
// Index:   0   1   2   3
// Value:   1   2   3   1
//          ↑           ↑
//       same value, distance = 3
// Got same value at distance ≤ k ( k is given)

import java.util.*;

public class ContainsDuplicateII {

    public static boolean ContainDuplicate(int[] arr, int k){

        Set <Integer> nums = new HashSet<>();

        for(int i=0; i<arr.length; i++){

            if(nums.contains(arr[i])) return true;

            nums.add(arr[i]);

            if(i >= k){
                nums.remove(arr[i-k]);
            }
        }
        return false;

    } 
    
    public static void main(String[] args){

        int[] arr = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(ContainDuplicate(arr, k));

    }
}



