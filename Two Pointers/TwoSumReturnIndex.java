import java.util.Arrays;

public class TwoSumReturnIndex {

    public static int[] twoSum(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            int sum = arr[l] + arr[r];

            if(sum == target){
                return new int[]{l+1, r+1};
            }
            else if (sum < target) {
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}
