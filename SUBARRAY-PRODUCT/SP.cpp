#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int maxProduct(vector<int>& nums) {
    //     int max = 0;
    //     if(nums.size() == 1){
    //         return nums[0];
    //     };
    //     for(int i = 0; i < nums.size(); i++){
    //         int temp = 1;
    //         for(int j = i; j< nums.size(); j++){
    //             temp = temp * nums[j];
    //             if(temp > max){
    //                 max = temp;
    //             }
    //         }
    //     }
    // return max;
    int arrmax = *max_element(nums.begin(), nums.end());
        int currmax = 1;
        int currmin = 1;
        
        for(int i = 0; i < nums.size(); i++){
            int temp = currmax * nums[i];
            currmax = max({temp, currmin * nums[i], nums[i]});
            currmin = min({temp, currmin * nums[i], nums[i]});

            arrmax = max(arrmax, currmax);
        }
    return arrmax;
    }
};

int main(){
    Solution S;
    vector<int> nums = {2,3,-2,4};
    cout<<S.maxProduct(nums);
    
    return 0;
}


