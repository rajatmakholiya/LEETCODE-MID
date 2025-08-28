class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        int prefix = 1;
        for (int i = 0; i< nums.length; i++){
            arr[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int j = nums.length - 1; j > -1; j--){
            arr[j] *= suffix;
            suffix *= nums[j];
        }
        return arr;
    }
}