// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count = 0;
//         for(int i = 0; i< nums.length; i++){
//             int sum = 0
//             for (int j = i; j<nums.length; j++){
//                 sum = sum + nums[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0, count = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        for (int num : nums) {
            currSum += num;
            if (prefixSum.containsKey(currSum - k)) {
                count += prefixSum.get(currSum - k);
            }
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
