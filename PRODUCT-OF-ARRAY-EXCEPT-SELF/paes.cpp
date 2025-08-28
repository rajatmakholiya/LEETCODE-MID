
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> arr(n, 1);

        int prefix = 1;
        for (int i = 0; i < nums.size(); i++){
            arr[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for (int j = nums.size() - 1; j > -1; j--){
            arr[j] = arr[j] * suffix;
            suffix = suffix * nums[j];
        }
        return arr;
    }
};