///////////////////////////// Using Hashmap (Best for unsorted array) /////////////////////
// import java.lang.annotation.Target;
// import java.util.*;

// public class TwoSumProblem{

//     public static int[] twoSum(int[] arr, int target){

//         Map<Integer, Integer> nums = new HashMap<>();

//         for(int i=0; i<arr.length; i++){
//             nums.put(arr[i], i);
//         }

//         for(int i=0; i<arr.length; i++){
//             int complement = target - arr[i];
//             if(nums.containsKey(complement) && nums.get(complement) != i){
//                 return new int[] {i, nums.get(complement)};
//             }
//         }
//         return new int[]{};
//     }
//     public static void main(String[] args) {
        
//         int[] arr = {1,1,5,2,10};
//         int target = 15;

//         int[] result = twoSum(arr, target);
//         System.out.println("For target: "+ target + " = " + arr[result[0]] + " + " + arr[result[1]]);

//     }
// }


////////////////////// Two Pointers ///////////////////////////////////////////////////////////

import java.util.Arrays;

public class TwoSumProblem{

    public static int[] twoSum(int[] arr, int target){

        int[][] nums = new int[arr.length][2];

        for(int i=0; i<arr.length; i++){
            nums[i][0] = arr[i];
            nums[i][1] = i;
        }

        Arrays.sort(nums, (a,b) -> a[0] - b[0]); // Twopointers Only works in a sorted array

        int l = 0;
        int r = arr.length-1;

        while(l < r){
            int sum = nums[l][0] + nums[r][0];
            if(sum == target){
                return new int[]{nums[l][1], nums[r][1]};
            }
            else if(sum < target){
                l++;
            }
            else{
                r++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 2, 10};
        int target = 15;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

// Time and space complexity -
// HashMap -
        // TC - O(n)
        // SC - O(n)
// Two pointers -
        // TC - O(n log n)
        // SC - O(n)