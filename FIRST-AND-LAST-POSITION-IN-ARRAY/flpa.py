from typing import List

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start = 0
        end = len(nums) - 1
        mid = len(nums) // 2
        arr = []
        res = -1
        while start <= end:
            if nums[mid] < target:
                start = mid + 1
            else:
                if nums[mid] == target:
                    res = mid
                end = mid - 1
            mid = start + (end - start) // 2
        arr.append(res)
        
        start = 0
        end = len(nums) - 1
        mid = len(nums) // 2
        res = -1

        while start <= end:
            if nums[mid] > target:
                end = mid - 1
            else:
                if nums[mid] == target:
                    res = mid
                start = mid + 1
            mid = start + (end - start) // 2
        arr.append(res)

        return arr if len(arr) > 0 else [-1, -1]



s = Solution()
# s.searchRange([5,7,7,8,8,10], 8)

s.searchRange([1], 1)