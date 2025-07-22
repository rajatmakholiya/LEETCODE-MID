class Solution {
    public int maxProduct(int[] nums) {
        int arrmax = Arrays.stream(nums).max().getAsInt();
        int currmax = 1;
        int currmin = 1;

        for (int i : nums){
            int temp = currmax * i;
            currmax = Math.max(temp, Math.max(currmin * i, i));
            currmin = Math.min(temp, Math.min(currmin * i, i));

            arrmax = Math.max(arrmax, currmax);

        }
        return arrmax;
    }
}