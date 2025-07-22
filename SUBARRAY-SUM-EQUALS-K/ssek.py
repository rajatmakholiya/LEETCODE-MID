from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        for i in range(len(nums)):
            tempsum = 0
            for j in range(i, len(nums)):
                tempsum = tempsum + nums[j]
                if tempsum == k:
                    count += 1
        return count

s = Solution()
print(s.subarraySum([0,0], 0))
print(s.subarraySum([1,1,1], 2))
print(s.subarraySum([1,2,3], 3))