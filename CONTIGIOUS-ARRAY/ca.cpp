class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> count_map;
        int count = 0;
        int maxlen = 0;

        count_map[0] = -1;

        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
                count --;
            }
            else{
                count ++;
            }
            if (count_map.find(count) != count_map.end()){
                maxlen = max(maxlen, i - count_map[count]);
            }
            else{
                count_map[count] = i;
            }
        }
    return maxlen;
    }
};