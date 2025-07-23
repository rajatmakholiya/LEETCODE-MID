class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}

public class mas{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Max average for nums1: " + sol.findMaxAverage(nums1, k1)); // Expected: 12.75

        // int[] nums2 = {5};
        // int k2 = 1;
        // System.out.println("Max average for nums2: " + sol.findMaxAverage(nums2, k2)); // Expected: 5.0

        // int[] nums3 = {0, 1, 1, 3, 6};
        // int k3 = 3;
        // System.out.println("Max average for nums3: " + sol.findMaxAverage(nums3, k3)); // Expected: 3.3333333333333335
    }

}