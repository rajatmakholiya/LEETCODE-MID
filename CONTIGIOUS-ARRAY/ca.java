import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        int maxLen = 0;

        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (countMap.containsKey(count)) {
                maxLen = Math.max(maxLen, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }

        return maxLen;
    }
}
