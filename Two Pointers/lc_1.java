
import java.lang.annotation.Target;
import java.util.*;

public class lc_1{

    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> nums = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            nums.put(arr[i], i);
        }

        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(nums.containsKey(complement) && nums.get(complement) != i){
                return new int[] {i, nums.get(complement)};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
        int[] arr = {1,1,5,2,10};
        int target = 15;

        int[] result = twoSum(arr, target);
        System.out.println("For target: "+ target + " = " + arr[result[0]] + " + " + arr[result[1]]);

    }
}