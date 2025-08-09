from typing import List
from collections import defaultdict

# class Solution:
#     def subarraySum(self, nums: List[int], k: int) -> int:
#         count = 0
#         for i in range(len(nums)):
#             tempsum = 0
#             for j in range(i, len(nums)):
#                 tempsum = tempsum + nums[j]
#                 if tempsum == k:
#                     count += 1
#         return count

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        curr_sum = 0
        prefix_sums = defaultdict(int)
        prefix_sums[0] = 1  # Base case: empty subarray sum

        for num in nums:
            curr_sum += num
            if (curr_sum - k) in prefix_sums:
                count += prefix_sums[curr_sum - k]
            prefix_sums[curr_sum] += 1

        return count

s = Solution()
print(s.subarraySum([0,0], 0))
print(s.subarraySum([1,1,1], 2))
print(s.subarraySum([1,2,3], 3))