// class Solution {
// public:
//     int subarraySum(vector<int>& nums, int k) {
//         int count = 0;
//         for(int i = 0; i< nums.size(); i++){
//             int sum = 0;
//             for (int j = i; j<nums.size(); j++){
//                 sum = sum + nums[j];
//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// };
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int currSum = 0, count = 0;
        unordered_map<int, int> prefixSum;
        prefixSum[0] = 1;

        for (int num : nums) {
            currSum += num;
            if (prefixSum.count(currSum - k)) {
                count += prefixSum[currSum - k];
            }
            prefixSum[currSum]++;
        }
        return count;
    }
};
