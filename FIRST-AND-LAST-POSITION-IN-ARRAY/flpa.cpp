class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int start = 0 ;
        int end = nums.size() - 1;
        int mid = nums.size() / 2;
        int res = -1;
        vector <int> arr;

        while (start <= end){
            if(nums[mid] < target){
                start = mid + 1;
            } else {
                if(nums[mid] == target){
                res = mid;
                }
                end = mid - 1;
            }
            mid = (end + start) / 2;
            }
        
        arr.push_back(res);

        start = 0 ;
        end = nums.size() - 1;
        mid = nums.size() / 2;
        res = -1;

        while (start <= end){
            if(nums[mid] > target){
                end = mid - 1;
            }else{
                if(nums[mid] == target){
                res = mid;
                }
                start = mid + 1;
            }
            mid = (end + start) / 2;
            }
        arr.push_back(res);

        return arr;
    }
};