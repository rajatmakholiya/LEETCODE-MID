class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        // Find first occurrence
        int start = 0, end = nums.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                if (nums[mid] == target) {
                    res = mid;
                }
                end = mid - 1;
            }
        }
        result[0] = res;

        // Find last occurrence
        start = 0;
        end = nums.length - 1;
        res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                if (nums[mid] == target) {
                    res = mid;
                }
                start = mid + 1;
            }
        }
        result[1] = res;

        return result;
    }
}
