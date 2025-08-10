from typing import List

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = csum = 0
        minlen = float('inf')
        
        for right in range(len(nums)):
            csum += nums[right]

            while csum >= target:
                minlen = min(minlen, right - left + 1)
                csum -= nums[left]
                left += 1

        return 0 if minlen == float('inf') else minlen

if __name__ == "__main__":
    s = Solution()
    # print(s.minSubArrayLen(7, [2,3,1,2,4,3]))  # Output: 2
    # print(s.minSubArrayLen(4, [1,4,4]))         # Output: 1
    print(s.minSubArrayLen(11, [1,1,1,1,1,1,1]))  # Output: 0
    # print(s.minSubArrayLen(15, [1,2,3,4,5]))   # Output: 5