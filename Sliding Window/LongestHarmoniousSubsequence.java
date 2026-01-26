/////////////////////// Longest Harmonious Subsequence ///////////////////////////////
// Number:   1   2   3   5   7
// Count:    1   3   2   1   1

// 1 → |█|
// 2 → |███|
// 3 → |██|
// 5 → |█|
// 7 → |█|

////////////////////Check consecutive pairs//////////////////////////////
// 1 → |█|
// 2 → |███|

// Total length = 1 + 3 = 4

// 2 → |███|
// 3 → |██|

// Total length = 3 + 2 = 5  

// (3,4) , (5,6) , (7,8) these pairs doesnt exist so skip it

// So, Longest Harmonious Subsequence length = 5

////////////////////// How to do it //////////////////////////////
// map = {
//   1=1,
//   2=3,
//   3=2,
//   5=1,
//   7=1
// }

// maxLen = 0

// for each key in map:
//     check key + 1
//         if exists:
//             currentLen = map[key] + map[key+1]
//             maxLen = max(maxLen, currentLen)



import java.util.*;

public class LongestHarmoniousSubsequence {
    public static int finder(int[] arr){

        HashMap<Integer, Integer> maps = new HashMap<>();

        for(int num: arr){
            maps.put(num, maps.getOrDefault(num, 0)+1);
        }

        int maxlen = 0;

        for(int key : maps.keySet()){
            if(maps.containsKey(key+1)){
                maxlen = Math.max(maxlen, maps.get(key) + maps.get(key+1));
            }
        }
        return maxlen;

    }
    public static void main(String[] args) {
        
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(finder(arr));;
    }
}
